public java.lang.String getBackupConfigKind(boolean isLocal) {
    return isLocal ? BackupConstants.LOCAL_RESTORE_KIND_PREFIX : BackupConstants.REMOTE_RESTORE_KIND_PREFIX;
}