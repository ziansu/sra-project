void filled(int hash, boolean withLock) {
    hash = java.lang.Math.abs(hash);
    java.util.concurrent.locks.ReentrantLock monitor = monitors[(hash % (monitors.length))];
    if (withLock)
        monitor.lock();
    
    try {
        int maskIdx = (hash / 32) % (filters.length);
        int maxPos = hash % 32;
        int maskFilter = 1 << maxPos;
        filters[maskIdx] |= maskFilter;
    } finally {
        if (withLock)
            monitor.unlock();
        
    }
}