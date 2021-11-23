public java.io.File getBackupDir(java.lang.String backupName, boolean isLocal) {
    if (backupName.endsWith(BackupConstants.COMPRESS_SUFFIX)) {
        backupName = org.apache.commons.io.FilenameUtils.removeExtension(backupName);
    }
    java.io.File backupDir = (isLocal) ? new java.io.File(getBackupDir(), backupName) : new java.io.File(BackupConstants.RESTORE_DIR, backupName);
    return backupDir;
}