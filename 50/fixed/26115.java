public synchronized void interrupt(java.lang.Thread thread) {
    if (thread == null) {
        throw new java.lang.IllegalStateException("not running");
    }
    thread.interrupt();
}