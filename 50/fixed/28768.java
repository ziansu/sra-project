protected synchronized void haltInSeconds(double seconds) {
    try {
        java.lang.Thread.sleep(((long) (seconds * 1000)));
        halt();
    } catch (java.lang.InterruptedException e) {
    }
}