public void updateDownloadSize(long size) {
    com.emc.storageos.systemservices.impl.restore.DownloadExecutor.log.info("lbymm increase download increase ={}", size);
    restoreStatus = backupOps.queryBackupRestoreStatus(remoteBackupFileName);
    long newSize = (restoreStatus.getDownoadSize()) + size;
    restoreStatus.setDownoadSize(newSize);
    com.emc.storageos.systemservices.impl.restore.DownloadExecutor.log.info("lbyn new status={}", restoreStatus);
    backupOps.persistBackupRestoreStatus(restoreStatus);
}