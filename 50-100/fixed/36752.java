@java.lang.Override
public void changed(com.couchbase.lite.replicator.Replication.ChangeEvent event) {
    if ((event.getTransition().getDestination()) == (ReplicationState.IDLE)) {
        com.couchbase.lite.util.Log.d(com.couchbase.lite.replicator.TAG, "Replication is IDLE");
        enteredIdleState.countDown();
    }else
        if ((event.getTransition().getDestination()) == (ReplicationState.STOPPED)) {
            event.getTransition().getDestination();
            com.couchbase.lite.util.Log.d(com.couchbase.lite.replicator.TAG, "Replication is STOPPED");
            enteredStoppedState.countDown();
        }
    
}