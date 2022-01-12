@java.lang.Override
public boolean mkdirs(tachyon.TachyonURI path, boolean recursive) throws java.io.IOException, tachyon.thrift.FileAlreadyExistException, tachyon.thrift.InvalidPathException {
    tachyon.client.FileSystemMasterClient masterClient = mContext.acquireMasterClient();
    try {
        boolean result = masterClient.createDirectory(path.getPath(), true);
        if (result) {
            tachyon.client.file.AbstractTachyonFileSystem.LOG.info(("Created directory " + (path.getPath())));
        }
        return result;
    } finally {
        mContext.releaseMasterClient(masterClient);
    }
}