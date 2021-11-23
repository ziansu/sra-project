public synchronized void interrupt() {
    if ((thread) == null) {
        throw new java.lang.IllegalStateException("not running");
    }
    thread.interrupt();
}