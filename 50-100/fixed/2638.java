@java.lang.Override
public java.util.List<java.lang.String> findLatestBackup() {
    java.util.List<java.lang.String> files;
    try {
        files = getObjectFromGCS(com.google.jenkins.plugins.persistentmaster.storage.GcloudGcsStorage.LAST_BACKUP_FILE);
    } catch (java.io.IOException e) {
        com.google.jenkins.plugins.persistentmaster.storage.GcloudGcsStorage.logger.log(java.util.logging.Level.FINE, "Exception while loading last-backup file", e);
        return null;
    }
    if (files.isEmpty()) {
        com.google.jenkins.plugins.persistentmaster.storage.GcloudGcsStorage.logger.info("Last-backup file is empty, no backups available.");
        return null;
    }
    return files;
}