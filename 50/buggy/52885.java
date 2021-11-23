public void updateDownloadSize(long size) {
    com.emc.storageos.systemservices.impl.restore.DownloadExecutor.log.info("Increase download size ={}", size);
    backupOps.setRestoreStatus(remoteBackupFileName, null, 0, size, false, false);
}