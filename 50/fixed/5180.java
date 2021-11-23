public void doneFilling() {
    try {
        lock.lock();
        --(numSeededHoles);
        shovelAvailable = true;
        readyToDig.signal();
    } finally {
        lock.unlock();
    }
}