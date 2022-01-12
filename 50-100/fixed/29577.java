public <V> com.github.alemures.fasttcp.futures.ListenableFuture<V> submit(final java.util.concurrent.Callable<V> callable) {
    final com.github.alemures.fasttcp.futures.ListenableFuture<V> future = new com.github.alemures.fasttcp.futures.ListenableFuture();
    executor.submit(new java.util.concurrent.Callable<java.lang.Object>() {
        @java.lang.Override
        public java.lang.Object call() throws java.lang.Exception {
            try {
                V result = callable.call();
                future.setResult(result);
                return result;
            } catch (java.lang.Exception e) {
                future.setFailure(e);
                throw e;
            }
        }
    });
    return future;
}