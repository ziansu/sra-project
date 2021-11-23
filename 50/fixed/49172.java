@java.lang.Override
protected org.apache.hadoop.hbase.regionserver.StoreFile.Writer createTmpWriter(org.apache.hadoop.hbase.mob.FileDetails fd, long smallestReadPoint) throws java.io.IOException {
    org.apache.hadoop.hbase.mob.StoreFile.Writer writer = store.createWriterInTmp(fd.maxKeyCount, this.compactionCompression, true, true, true);
    return writer;
}