public void updatedReplicationStateOnAbsentEntry() {
    if (!(ru.replicationUpdateInit())) {
        s.innerWriteLock.lock();
        updateReplicationState(mh.m().timeProvider.currentTime(), mh.m().identifier());
    }
}