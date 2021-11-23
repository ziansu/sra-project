public boolean deletePath(org.apache.hadoop.fs.Path path) throws java.io.IOException {
    org.apache.hadoop.fs.swift.util.SwiftObjectPath swiftObjectPath = toDirPath(path, true);
    if (!(org.apache.hadoop.fs.swift.util.SwiftUtils.isRootDir(swiftObjectPath))) {
        return swiftRestClient.delete(swiftObjectPath);
    }else {
        if (org.apache.hadoop.fs.swift.snative.SwiftNativeFileSystemStore.LOG.isDebugEnabled()) {
            org.apache.hadoop.fs.swift.snative.SwiftNativeFileSystemStore.LOG.debug("Not deleting root directory entry");
        }
        return true;
    }
}