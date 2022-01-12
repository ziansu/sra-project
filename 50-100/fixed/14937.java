protected void retryReplicationIfError() {
    if (!(stateMachine.getState().equals(ReplicationState.IDLE))) {
        return ;
    }
    if ((this.error) == null) {
        retryCount = 0;
    }else {
        if ((retryCount) < (com.couchbase.lite.replicator.ReplicationInternal.MAX_RETRIES)) {
            if (isContinuous()) {
                if (com.couchbase.lite.util.Utils.isTransientError(this.error)) {
                    cancelRetryFuture();
                    scheduleRetryFuture();
                }
            }
        }
    }
}