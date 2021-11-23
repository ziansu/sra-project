private void removeExpiredStickyFlags(org.dcache.pool.repository.MetaDataRecord entry) throws diskCacheV111.util.CacheException {
    synchronized(entry) {
        org.dcache.pool.repository.CacheEntry oldEntry = new org.dcache.pool.repository.v5.CacheEntryImpl(entry);
        java.util.Collection<org.dcache.pool.repository.StickyRecord> removed = entry.removeExpiredStickyFlags();
        for (org.dcache.pool.repository.StickyRecord record : removed) {
            org.dcache.pool.repository.v5.CacheEntryImpl newEntry = new org.dcache.pool.repository.v5.CacheEntryImpl(entry);
            stickyChanged(oldEntry, newEntry, record);
        }
        scheduleExpirationTask(entry);
    }
}