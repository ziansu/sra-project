private void postDownload(com.emc.vipr.model.sys.backup.BackupRestoreStatus.Status status) {
    restoreStatus = backupOps.queryBackupRestoreStatus(remoteBackupFileName, false);
    com.emc.vipr.model.sys.backup.BackupRestoreStatus.Status s = null;
    if ((restoreStatus.getStatus()) == (com.emc.vipr.model.sys.backup.BackupRestoreStatus.Status.DOWNLOADING)) {
        long nodeNumber = backupOps.getHosts().size();
        if ((restoreStatus.getNodeCompleted()) == (nodeNumber - 1)) {
            s = com.emc.vipr.model.sys.backup.BackupRestoreStatus.Status.DOWNLOAD_SUCCESS;
        }
    }
    setDownloadStatus(remoteBackupFileName, s, 0, 0);
}