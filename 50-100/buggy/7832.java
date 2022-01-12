public boolean onPreferenceChange(android.preference.Preference preference, final java.lang.Object newValue) {
    final java.lang.String newPath = ((java.lang.String) (newValue));
    try {
        com.ichi2.anki.AnkiDroidApp.initializeAnkiDroidDirectory(newPath);
        AnkiDroidApp.sStorageAccessExceptionFlag = false;
        return true;
    } catch (com.ichi2.anki.exception.StorageAccessException e) {
        timber.log.Timber.e(e, "Could not initialize directory: %s", newPath);
        android.widget.Toast.makeText(getApplicationContext(), R.string.dialog_collection_path_not_dir, Toast.LENGTH_LONG).show();
        return false;
    }
}