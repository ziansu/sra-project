private void stopRegisterEventProcessing() {
    synchronized(lock) {
        --(registerEventProcessing);
        notifyAll();
    }
}