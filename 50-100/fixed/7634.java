public java.io.File getBackupDir(java.lang.String backupName, boolean isLocal) {
    java.lang.String name = backupName;
    if (backupName.endsWith(BackupConstants.COMPRESS_SUFFIX)) {
        name = org.apache.commons.io.FilenameUtils.removeExtension(backupName);
    }
    return isLocal ? new java.io.File(getBackupDir(), name) : new java.io.File(BackupConstants.RESTORE_DIR, name);
}