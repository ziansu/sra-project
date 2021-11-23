@java.lang.Override
public void pushTaskLog(java.lang.String taskId, java.io.File logFile) throws java.io.IOException {
    final org.apache.hadoop.fs.Path path = getTaskLogFileFromId(taskId);
    io.druid.storage.hdfs.tasklog.HdfsTaskLogs.log.info("Writing task log to: %s", path);
    final org.apache.hadoop.fs.FileSystem fs = path.getFileSystem(hadoopConfig);
    try (final java.io.InputStream in = new java.io.FileInputStream(logFile);final java.io.OutputStream out = fs.create(path, true)) {
        com.google.common.io.ByteStreams.copy(in, out);
    }
    io.druid.storage.hdfs.tasklog.HdfsTaskLogs.log.info("Wrote task log to: %s", path);
}