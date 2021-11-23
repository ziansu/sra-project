public void startFilling() throws java.lang.InterruptedException {
    try {
        lock.lock();
        while (((numSeededHoles) == 0) || (!(shovelAvailable)))
            readyToFill.await();
        
        shovelAvailable = false;
    } finally {
        lock.unlock();
    }
}