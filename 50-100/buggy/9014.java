@java.lang.Override
public void doIt(com.github.oxo42.stateless4j.transitions.Transition<com.couchbase.lite.replicator.ReplicationState, com.couchbase.lite.replicator.ReplicationTrigger> transition) {
    com.couchbase.lite.util.Log.v(Log.TAG_SYNC, ((("[onExit()] " + (transition.getSource())) + " => ") + (transition.getDestination())));
    goOnline();
    notifyChangeListenersStateTransition(transition);
}