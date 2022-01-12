@java.lang.Override
public boolean accept(org.apache.hadoop.fs.Path path) {
    if (org.apache.hadoop.hbase.wal.DefaultWALProvider.isMetaFile(path)) {
        if (org.apache.hadoop.hbase.backup.impl.IncrementalBackupManager.LOG.isDebugEnabled()) {
            org.apache.hadoop.hbase.backup.impl.IncrementalBackupManager.LOG.debug(("Skip .meta log file: " + (path.getName())));
        }
        return false;
    }
    java.lang.Long timestamp = null;
    try {
        timestamp = org.apache.hadoop.hbase.backup.util.BackupClientUtil.getCreationTime(path);
        return timestamp > (java.lang.Long.valueOf(lastBackupTS));
    } catch (java.lang.Exception e) {
        org.apache.hadoop.hbase.backup.impl.IncrementalBackupManager.LOG.warn(("Cannot read timestamp of log file " + path));
        return false;
    }
}