@java.lang.Override
public void close() throws java.io.IOException {
    if (chunk.hasData()) {
        sendChunk();
    }
    com.google.common.util.concurrent.ListenableFuture<java.lang.String> allFutures = com.google.common.util.concurrent.Futures.whenAllSucceed(futures).call(() -> "ok");
    try {
        allFutures.get();
    } catch (java.lang.InterruptedException e) {
        throw new com.flightstats.hub.util.RuntimeInterruptedException(e);
    } catch (java.util.concurrent.ExecutionException e) {
        throw new java.lang.RuntimeException(e);
    }
}