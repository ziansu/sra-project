@com.couchbase.lite.internal.InterfaceAudience.Public
public boolean isRunning() {
    if ((replicationInternal) == null) {
        return false;
    }
    return ((replicationInternal.stateMachine.isInState(ReplicationState.RUNNING)) || (replicationInternal.stateMachine.isInState(ReplicationState.IDLE))) || (replicationInternal.stateMachine.isInState(ReplicationState.OFFLINE));
}