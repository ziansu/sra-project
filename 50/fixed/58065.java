public void sleepFor(final long milliseconds) {
    try {
        java.lang.Thread.sleep(milliseconds);
    } catch (java.lang.InterruptedException e) {
        java.lang.Thread.currentThread().interrupt();
    }
}