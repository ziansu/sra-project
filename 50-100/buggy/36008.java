public void onSyncedSharedPreferencesChanged(com.perrchick.someapplication.SyncedSharedPreferencesChangeType changeType, java.lang.String key, java.lang.String value) {
    if ((com.perrchick.someapplication.StorageActivity.EDIT_TEXT_PERSISTENCE_KEY) == key) {
        if ((changeType.compareTo(SyncedSharedPreferencesChangeType.Removed)) == 0) {
            editTextFirebase.setText("");
        }else {
            editTextFirebase.setText(value);
        }
    }
    com.perrchick.someapplication.utilities.PerrFuncs.toast((((((("Firebase key value " + changeType) + ": <") + key) + ",") + value) + ">"));
}