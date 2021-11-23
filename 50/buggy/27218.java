@java.lang.Override
public org.apache.hadoop.fs.FileStatus getFileStatus(org.apache.hadoop.fs.Path path) throws java.io.IOException {
    org.apache.hadoop.fs.Path absolutePath = makeAbsolute(path);
    return store.getObjectMetadata(absolutePath);
}