public void startDigging() throws java.lang.InterruptedException {
    try {
        lock.lock();
        int totalHoles = (numUnseededHoles) + (numSeededHoles);
        while ((totalHoles == (max_holes)) || (!(shovelAvailable))) {
            readyToDig.await();
            totalHoles = (numUnseededHoles) + (numSeededHoles);
        } 
        shovelAvailable = false;
    } finally {
        lock.unlock();
    }
}