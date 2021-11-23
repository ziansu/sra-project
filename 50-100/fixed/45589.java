void resetEntry(net.jodah.expiringmap.ExpiringMap.ExpiringEntry<K, V> entry, boolean scheduleFirstEntry) {
    writeLock.lock();
    try {
        boolean scheduled = entry.cancel();
        entries.reorder(entry);
        if (scheduled || scheduleFirstEntry)
            scheduleEntry(entries.first());
        
    } finally {
        writeLock.unlock();
    }
}