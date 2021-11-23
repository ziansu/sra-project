public void doneSeeding() {
    try {
        lock.lock();
        ++(numSeededHoles);
        --(numUnseededHoles);
        readyToFill.signal();
        java.lang.System.out.println("Done seeding.");
    } finally {
        lock.unlock();
    }
}