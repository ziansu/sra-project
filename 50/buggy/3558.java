protected void threadSleep() {
    try {
        java.lang.Thread.sleep(sleepTime);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}