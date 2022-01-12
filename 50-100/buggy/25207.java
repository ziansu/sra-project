public void startDigging() throws java.lang.InterruptedException {
    try {
        lock.lock();
        java.lang.System.out.println("Trying to start digging.");
        int totalHoles = (numUnseededHoles) + (numSeededHoles);
        while ((totalHoles == (max_holes)) || (!(shovelAvailable)))
            readyToDig.await();
        
        java.lang.System.out.println("Starting digging.");
        shovelAvailable = false;
    } finally {
        lock.unlock();
    }
}