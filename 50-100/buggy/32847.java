public void startFilling() throws java.lang.InterruptedException {
    try {
        lock.lock();
        java.lang.System.out.println("Trying to start filling.");
        while (((numSeededHoles) == 0) || (!(shovelAvailable)))
            readyToFill.await();
        
        shovelAvailable = false;
        java.lang.System.out.println("Filling started.");
    } finally {
        lock.unlock();
    }
}