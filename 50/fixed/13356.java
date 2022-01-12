protected org.apache.hadoop.fs.FileSystem getFileSystem(org.apache.hadoop.conf.Configuration conf) throws java.io.IOException {
    return org.apache.hadoop.fs.FileSystem.get(conf);
}