private org.apache.hadoop.fs.FSDataOutputStream makeHdfsOutputStream(java.lang.String path) throws java.io.IOException {
    java.lang.StringBuilder baseDir = new java.lang.StringBuilder(32);
    org.apache.hadoop.fs.FileSystem fs = m_fileSystemManager.getFileSystem("dump", baseDir);
    org.apache.hadoop.fs.Path file = new org.apache.hadoop.fs.Path(baseDir.toString(), path);
    org.apache.hadoop.fs.FSDataOutputStream out;
    try {
        out = fs.create(file);
    } catch (org.apache.hadoop.hdfs.protocol.AlreadyBeingCreatedException e) {
        fs.delete(file, false);
        out = fs.create(file);
    }
    return out;
}