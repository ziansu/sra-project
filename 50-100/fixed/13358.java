public T take() {
    T aJob = null;
    lock.lock();
    try {
        while (((queue.size()) == 0) || ((aJob = queue.pop()) == null)) {
            idle = true;
            lock.unlock();
            mutex.lock();
            lock.lock();
            idle = false;
        } 
    } finally {
        lock.unlock();
    }
    return aJob;
}