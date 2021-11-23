protected void stop() {
    batcher.clear();
    setLifecycle(Replication.Lifecycle.ONESHOT);
    cancelRetryFuture();
    while (!(pendingFutures.isEmpty())) {
        java.util.concurrent.Future future = pendingFutures.poll();
        if (((future != null) && (!(future.isCancelled()))) && (!(future.isDone()))) {
            future.cancel(true);
        }
    } 
}