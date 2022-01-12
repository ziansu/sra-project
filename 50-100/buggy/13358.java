public T take() {
    T aJob = null;
    lock.lock();
    try {
        while (((queue.size()) == 0) || ((aJob = queue.pop()) == null)) {
            lock.unlock();
            idle = true;
            mutex.lock();
            idle = false;
            lock.lock();
        } 
    } finally {
        lock.unlock();
    }
    return aJob;
}