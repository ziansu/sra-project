@java.lang.Override
public void changed(com.couchbase.lite.replicator.Replication.ChangeEvent event) {
    if (((event.getTransition()) != null) && ((event.getTransition().getDestination()) == (com.couchbase.lite.replicator.ReplicationState.STOPPED))) {
        doneSignal.countDown();
        assertEquals(event.getChangeCount(), event.getCompletedChangeCount());
    }
}