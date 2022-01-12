@java.lang.Override
protected void timeStep() throws java.lang.Exception {
    if (!(semaphore.tryAcquire(1, acquireTimeoutMs, java.util.concurrent.TimeUnit.MILLISECONDS))) {
        throw new java.lang.RuntimeException();
    }
    java.lang.Integer key = randomInt(keyCount);
    com.hazelcast.core.ICompletableFuture f = ((com.hazelcast.core.ICompletableFuture) (map.putAsync(key, key)));
    f.andThen(this);
}