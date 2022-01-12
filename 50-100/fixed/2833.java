@java.lang.Override
public V remove(java.lang.Object key) {
    net.jodah.expiringmap.internal.Assert.notNull(key, "key");
    writeLock.lock();
    try {
        net.jodah.expiringmap.ExpiringMap.ExpiringEntry<K, V> entry = entries.remove(key);
        if (entry == null)
            return null;
        
        if (entry.cancel())
            scheduleEntry(entries.first());
        
        return entry.getValue();
    } finally {
        writeLock.unlock();
    }
}