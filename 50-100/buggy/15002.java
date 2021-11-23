private void markIncompleteZipFileFinished(java.lang.String fileName, boolean success) {
    try {
        java.lang.String suffix = (success) ? com.emc.storageos.management.backup.BackupConstants.COMPRESS_SUFFIX : com.emc.storageos.management.backup.BackupConstants.INVALID_COMPRESS_SUFFIX;
        java.lang.String finishedName = fileName.replaceFirst(((com.emc.storageos.management.backup.BackupConstants.INCOMPLETE_COMPRESS_SUFFIX) + "$"), (suffix + "$"));
        uploader.rename(fileName, finishedName);
        com.emc.storageos.systemservices.impl.jobs.backupscheduler.UploadExecutor.log.warn("Marked the uploading backup zip file({}) as {}", fileName, (success ? "completed" : "invalid"));
    } catch (java.lang.Exception e) {
        com.emc.storageos.systemservices.impl.jobs.backupscheduler.UploadExecutor.log.warn("Failed to rename the uploading backup zip file({})", fileName, e);
    }
}