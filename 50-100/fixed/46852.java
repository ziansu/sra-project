public void run() {
    runThread = java.lang.Thread.currentThread();
    stopRequested = false;
    int count = 0;
    while (!(stopRequested)) {
        soundTrack();
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException x) {
            java.lang.Thread.currentThread().interrupt();
        }
    } 
}