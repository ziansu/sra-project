public boolean isRunning() {
    lock.lock();
    try {
        return ((process) != null) && (process.isRunning());
    } catch (java.lang.IllegalThreadStateException e) {
        return true;
    } finally {
        lock.unlock();
    }
}