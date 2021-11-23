public <V> com.github.alemures.fasttcp.futures.ListenableFuture<V> submit(final java.util.concurrent.Callable<V> callable) {
    final com.github.alemures.fasttcp.futures.ListenableFuture<V> future = new com.github.alemures.fasttcp.futures.ListenableFuture();
    executor.submit(() -> {
        try {
            V result = callable.call();
            future.setResult(result);
            return result;
        } catch (java.lang.Exception e) {
            future.setFailure(e);
            throw e;
        }
    });
    return future;
}