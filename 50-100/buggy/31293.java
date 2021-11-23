@java.lang.Override
public void removeAll() {
    if (threadSafe) {
        lock.writeLock().lock();
    }
    try {
        indexes.clear();
        indexKeyTypes.clear();
        indexValueTypes.clear();
    } finally {
        if (threadSafe) {
            lock.writeLock().unlock();
        }
    }
}