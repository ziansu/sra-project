@javax.annotation.concurrent.GuardedBy(value = "getMetaDataRecord(newEntry.getPnfsid())")
protected void stickyChanged(org.dcache.pool.repository.CacheEntry oldEntry, org.dcache.pool.repository.CacheEntry newEntry, org.dcache.pool.repository.StickyRecord record) {
    updateRemovable(newEntry);
    org.dcache.pool.repository.StickyChangeEvent event = new org.dcache.pool.repository.StickyChangeEvent(oldEntry, newEntry, record);
    _stateChangeListeners.stickyChanged(event);
}