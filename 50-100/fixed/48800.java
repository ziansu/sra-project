@java.lang.Override
public void clear() {
    writeLock.lock();
    try {
        for (net.jodah.expiringmap.ExpiringMap.ExpiringEntry<K, V> entry : entries.values())
            entry.cancel();
        
        entries.clear();
    } finally {
        writeLock.unlock();
    }
}