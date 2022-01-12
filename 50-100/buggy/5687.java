@java.lang.Override
public void changed(com.couchbase.lite.replicator.Replication.ChangeEvent event) {
    com.couchbase.lite.util.Log.e(com.couchbase.lite.replicator.TAG, event.toString());
    if ((event.getError()) != null) {
        junit.framework.Assert.fail("Should not have any error....");
    }
    if ((event.getTransition().getDestination()) == (ReplicationState.IDLE)) {
        idleSignal1.countDown();
        idleSignal2.countDown();
    }
}