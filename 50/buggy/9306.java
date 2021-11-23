@java.lang.Override
public void updateOrigin(byte newIdentifier, long newTimestamp) {
    checkOnEachPublicOperation.checkOnEachPublicOperation();
    s.innerWriteLock.lock();
    updateReplicationState(newTimestamp, newIdentifier);
}