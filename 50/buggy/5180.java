public void doneFilling() {
    try {
        lock.lock();
        --(numSeededHoles);
        shovelAvailable = true;
        readyToDig.signal();
        java.lang.System.out.println("Filling done.");
    } finally {
        lock.unlock();
    }
}