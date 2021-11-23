@java.lang.Override
public void run() {
    if (getChunksBeforeRead) {
        while ((mockNetworkClient.getProcessedResponseCount()) < (numChunks * (routerConfig.routerGetRequestParallelism))) {
            java.lang.Thread.yield();
        } 
    }
    java.util.concurrent.Future<java.lang.Long> readIntoFuture = (initiateReadBeforeChunkGet) ? preSetReadIntoFuture : result.getBlobDataChannel().readInto(asyncWritableChannel, null);
    assertBlobReadSuccess(options, readIntoFuture, asyncWritableChannel, readCompleteLatch, readCompleteResult, readCompleteException);
}