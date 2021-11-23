private void initializeInternal(java.net.URI uri) throws java.io.IOException {
    FileSystemContext.INSTANCE.reset();
    alluxio.client.file.FileSystemMasterClient client = FileSystemContext.INSTANCE.acquireMasterClient();
    try {
        client.connect();
    } catch (alluxio.exception.ConnectionFailedException | java.io.IOException e) {
        alluxio.hadoop.AbstractFileSystemProxy.LOG.error("Failed to connect to the provided master address {}: {}.", uri.toString(), e.toString());
        throw new java.io.IOException(e);
    } finally {
        FileSystemContext.INSTANCE.releaseMasterClient(client);
    }
}