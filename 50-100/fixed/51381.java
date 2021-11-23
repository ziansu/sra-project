@com.couchbase.lite.internal.InterfaceAudience.Private
protected void setError(java.lang.Throwable throwable) {
    if (throwable != (this.error)) {
        com.couchbase.lite.util.Log.e(Log.TAG_SYNC, "%s: Progress: set error = %s", this, throwable);
        parentReplication.setLastError(throwable);
        this.error = throwable;
        if ((com.couchbase.lite.util.Utils.isPermanentError(this.error)) || (!(isContinuous()))) {
            triggerStopGraceful();
        }
        com.couchbase.lite.replicator.Replication.ChangeEvent changeEvent = new com.couchbase.lite.replicator.Replication.ChangeEvent(this, this.error);
        notifyChangeListeners(changeEvent);
    }
}