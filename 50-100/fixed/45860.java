public java.lang.String getKey() {
    java.util.concurrent.locks.Lock lock = mutationLock.readLock();
    lock.lock();
    try {
        return null == (templateResource) ? name : templateResource.getKey().toString();
    } finally {
        lock.unlock();
    }
}