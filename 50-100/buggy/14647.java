private void scheduleRetryFuture() {
    long delay = ((long) ((com.couchbase.lite.replicator.ReplicationInternal.RETRY_DELAY_SECONDS) * (java.lang.Math.pow(1.5, ((double) (retryCount))))));
    com.couchbase.lite.util.Log.v(Log.TAG_SYNC, "%s: Failed to xfer; will retry in %d sec", this, delay);
    this.retryFuture = workExecutor.schedule(new java.lang.Runnable() {
        public void run() {
            retryIfReady();
        }
    }, delay, java.util.concurrent.TimeUnit.SECONDS);
}