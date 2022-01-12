public void sleep(long delay) {
    try {
        java.lang.Thread.sleep(delay);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}