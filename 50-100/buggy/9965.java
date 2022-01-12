@java.lang.Override
public boolean containsIndex(java.lang.String indexId) {
    if (threadSafe) {
        lock.readLock().lock();
    }
    try {
        return indexes.containsKey(indexId);
    } finally {
        if (threadSafe) {
            lock.readLock().unlock();
        }
    }
}