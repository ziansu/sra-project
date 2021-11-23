private void sleep(long l) {
    if (l > 0L) {
        try {
            java.lang.Thread.sleep(l);
        } catch (java.lang.InterruptedException ex) {
            java.lang.Thread.currentThread().interrupt();
        }
    }
}