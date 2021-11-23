private com.emc.storageos.systemservices.impl.resource.Response setRestoreFailed(java.lang.String backupName, java.lang.String msg) {
    com.emc.vipr.model.sys.backup.BackupRestoreStatus.Status s = com.emc.vipr.model.sys.backup.BackupUploadStatus.Status.RESTORE_FAILED;
    s.setMessage(msg);
    backupOps.setRestoreStatus(backupName, s, 0, 0, false, false, true);
    throw SyssvcException.syssvcExceptions.restoreFailed(backupName, msg);
}