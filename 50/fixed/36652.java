public T poll() {
    lock.lock();
    try {
        return dequeue();
    } finally {
        lock.unlock();
    }
}