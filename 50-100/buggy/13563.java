private static java.io.File getBackupDirectory() {
    if ((com.ichi2.anki.BackupManager.mBackupDirectoryPath) == null) {
        android.content.SharedPreferences prefs = com.tomgibara.android.veecheck.util.PrefSettings.getSharedPrefs(com.ichi2.anki.AnkiDroidApp.getInstance().getBaseContext());
        com.ichi2.anki.BackupManager.mBackupDirectoryPath = (prefs.getString("deckPath", com.ichi2.anki.AnkiDroidApp.getStorageDirectory())) + (com.ichi2.anki.BackupManager.BACKUP_SUFFIX);
        com.ichi2.anki.BackupManager.mMaxBackups = prefs.getInt("backupMax", 3);
    }
    java.io.File directory = new java.io.File(com.ichi2.anki.BackupManager.mBackupDirectoryPath);
    if (!(directory.isDirectory())) {
        directory.mkdirs();
    }
    return directory;
}