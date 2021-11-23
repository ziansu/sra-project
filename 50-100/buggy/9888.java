public com.buyhatke.core.Entry get(java.lang.String key) {
    com.buyhatke.core.Entry entry = getInMemoryEntry(key);
    if (entry == null) {
        entry = checkInFileSystem(key);
        if (entry != null) {
            if (!(com.buyhatke.core.PersistenceManager.isExpired(entry))) {
                cacheListMap.put(entry.getKey(), entry);
            }else {
                return null;
            }
        }
    }
    return entry;
}