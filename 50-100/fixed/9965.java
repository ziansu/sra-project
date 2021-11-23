@java.lang.Override
public boolean containsIndex(java.lang.String indexId) {
    if (threadSafe) {
        lock.readLock().lock();
        try {
            return indexes.containsKey(indexId);
        } finally {
            lock.readLock().unlock();
        }
    }else {
        return indexes.containsKey(indexId);
    }
}