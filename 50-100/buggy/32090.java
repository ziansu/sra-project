@java.lang.Override
public void run() {
    try {
        synchronized(changeListeners) {
            for (com.couchbase.lite.replicator.ReplicationInternal.ChangeListener changeListener : changeListeners) {
                changeListener.changed(changeEvent);
            }
        }
    } catch (java.lang.Exception e) {
        com.couchbase.lite.util.Log.e(Log.TAG_SYNC, "Exception notifying replication listener: %s", e);
        throw new java.lang.RuntimeException(e);
    }
}