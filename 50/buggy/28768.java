protected synchronized void haltInSeconds(double seconds) {
    try {
        java.lang.Thread.sleep(((long) (seconds * 1000)));
    } catch (java.lang.InterruptedException e) {
    } finally {
        halt();
    }
}