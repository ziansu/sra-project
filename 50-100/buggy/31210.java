@java.lang.Override
public void doIt(com.github.oxo42.stateless4j.transitions.Transition<com.couchbase.lite.replicator.ReplicationState, com.couchbase.lite.replicator.ReplicationTrigger> transition) {
    com.couchbase.lite.util.Log.v(Log.TAG_SYNC, ((("[onEntry()] " + (transition.getSource())) + " => ") + (transition.getDestination())));
    saveLastSequence();
    this.clearDbRef();
    close();
    if ((transition.getSource()) == (transition.getDestination())) {
        return ;
    }
    notifyChangeListenersStateTransition(transition);
}