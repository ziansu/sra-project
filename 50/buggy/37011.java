public byte[] getJavaByteCode() {
    java.util.concurrent.locks.Lock lock = mutationLock.readLock();
    lock.lock();
    try {
        return javaByteCode;
    } finally {
        lock.unlock();
    }
}