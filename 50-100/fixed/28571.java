public void updatedReplicationStateOnAbsentEntry() {
    if (!(ru.replicationUpdateInit())) {
        s.innerWriteLock.lock();
        updateReplicationState(mh.m().identifier(), mh.m().timeProvider.currentTime());
    }
}