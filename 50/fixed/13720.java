private void stopRegisterEventProcessing() {
    synchronized(lock) {
        --(registerEventProcessing);
        lock.notifyAll();
    }
}