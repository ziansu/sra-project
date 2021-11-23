public synchronized boolean requestSpace(final long blockId, final long requestBytes) throws java.io.IOException {
    try {
        return retryRPC(new alluxio.client.block.RpcCallableThrowsAlluxioTException<java.lang.Boolean>() {
            @java.lang.Override
            public java.lang.Boolean call() throws alluxio.thrift.AlluxioTException, org.apache.thrift.TException {
                return mClient.requestSpace(mSessionId, blockId, requestBytes);
            }
        });
    } catch (alluxio.exception.AlluxioException e) {
        if (e instanceof alluxio.exception.WorkerOutOfSpaceException) {
            return false;
        }else {
            throw new java.io.IOException(e);
        }
    }
}