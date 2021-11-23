public boolean isRunning() {
    lock.lock();
    try {
        if ((process) == null) {
            return false;
        }
        return process.isRunning();
    } catch (java.lang.IllegalThreadStateException e) {
        return true;
    } finally {
        lock.unlock();
    }
}