private static java.io.File getBackupDirectory() {
    android.content.SharedPreferences prefs = com.tomgibara.android.veecheck.util.PrefSettings.getSharedPrefs(com.ichi2.anki.AnkiDroidApp.getInstance().getBaseContext());
    java.io.File directory = new java.io.File(((prefs.getString("deckPath", com.ichi2.anki.AnkiDroidApp.getStorageDirectory())) + (com.ichi2.anki.BackupManager.BACKUP_SUFFIX)));
    if (!(directory.isDirectory())) {
        directory.mkdirs();
    }
    return directory;
}