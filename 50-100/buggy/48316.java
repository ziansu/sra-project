private void runTaskQueue() {
    while ((acquiredChannelCount) <= (maxConnections)) {
        io.netty.channel.pool.FixedChannelPool.AcquireTask task = pendingAcquireQueue.poll();
        if (task == null) {
            break;
        }
        java.util.concurrent.ScheduledFuture<?> timeoutFuture = task.timeoutFuture;
        if (timeoutFuture != null) {
            timeoutFuture.cancel(false);
        }
        --(pendingAcquireCount);
        ++(acquiredChannelCount);
        super.acquire(task.promise);
    } 
    assert (pendingAcquireCount) >= 0;
    assert (acquiredChannelCount) >= 0;
}