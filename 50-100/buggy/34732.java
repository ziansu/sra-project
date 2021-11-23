public void cancelDownload() {
    java.util.Map<java.lang.String, java.lang.String> map = backupOps.getCurrentBackupInfo();
    com.emc.storageos.systemservices.impl.restore.DownloadExecutor.log.info("lbye To cancel current download {}", map);
    java.lang.String backupName = map.get(BackupConstants.CURRENT_DOWNLOADING_BACKUP_NAME_KEY);
    boolean isLocal = java.lang.Boolean.parseBoolean(map.get(BackupConstants.CURRENT_DOWNLOADING_BACKUP_ISLOCAL_KEY));
    com.emc.storageos.systemservices.impl.restore.DownloadExecutor.log.info("lbye backupname={}, isLocal={}", backupName, isLocal);
    if (isLocal == false) {
        setDownloadStatus(backupName, BackupRestoreStatus.Status.DOWNLOAD_CANCELLED, 0, 0);
        com.emc.storageos.systemservices.impl.restore.DownloadExecutor.log.info("lbye Persist cancel flag into zk");
    }
}