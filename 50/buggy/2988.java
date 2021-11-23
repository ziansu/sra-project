public synchronized void stop() {
    try {
        cancel();
    } catch (java.lang.IllegalStateException e) {
    }
}