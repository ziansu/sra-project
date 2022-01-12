public boolean isDownloadComplete(java.lang.String backupName) {
    com.emc.vipr.model.sys.backup.BackupRestoreStatus s = queryBackupRestoreStatus(backupName, false);
    if ((s.getStatus()) != (BackupRestoreStatus.Status.DOWNLOAD_SUCCESS)) {
        return false;
    }
    java.io.File downloadFolder = getDownloadDirectory(backupName);
    try {
        checkBackup(downloadFolder, false);
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}