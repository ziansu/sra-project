public boolean writeAllBack(de.doe300.activerecord.store.impl.CachedJDBCRecordStore store) {
    if ((cachedRows.isEmpty()) || (!(dataChanged))) {
        return false;
    }
    boolean changed = false;
    for (de.doe300.activerecord.store.impl.RowCache cache : cachedRows.values()) {
        if (cache.writeBack(store, base)) {
            changed = true;
        }
    }
    dataChanged = false;
    return changed;
}