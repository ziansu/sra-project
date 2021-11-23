private void checkBackupInfo(final java.io.File backupInfoFile, boolean backupInMultiVdc) {
    try (java.io.InputStream fis = new java.io.FileInputStream(backupInfoFile)) {
        java.util.Properties properties = new java.util.Properties();
        properties.load(fis);
        checkVersion(properties);
        checkHosts(properties, backupInMultiVdc);
    } catch (java.io.IOException ex) {
        com.emc.storageos.management.backup.RestoreManager.log.warn("Unable to check backup Info");
    }
}