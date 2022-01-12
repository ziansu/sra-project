public long consumingWindowSpan() {
    if (window.isEmpty()) {
        return 0;
    }
    lock.readLock().lock();
    try {
        return (window.last()) - (window.first());
    } finally {
        lock.readLock().unlock();
    }
}