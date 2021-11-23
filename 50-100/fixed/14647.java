private void scheduleRetryFuture() {
    com.couchbase.lite.util.Log.v(Log.TAG_SYNC, "%s: Failed to xfer; will retry in %d sec", this, com.couchbase.lite.replicator.ReplicationInternal.RETRY_DELAY_SECONDS);
    this.retryFuture = workExecutor.schedule(new java.lang.Runnable() {
        public void run() {
            retryIfReady();
        }
    }, com.couchbase.lite.replicator.ReplicationInternal.RETRY_DELAY_SECONDS, java.util.concurrent.TimeUnit.SECONDS);
}