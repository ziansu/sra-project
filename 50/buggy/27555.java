private java.lang.String getBackupConfigKind(java.lang.String backupName, boolean isLocal) {
    return isLocal ? BackupConstants.LOCAL_RESTORE_KIND_PREFIX : BackupConstants.REMOTE_RESTORE_KIND_PREFIX;
}