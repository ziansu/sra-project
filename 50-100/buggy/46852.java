public void run() {
    runThread = java.lang.Thread.currentThread();
    stopRequested = false;
    int count = 0;
    while (!(stopRequested)) {
        soundTrack();
        java.lang.System.out.println(("count: " + count));
        count++;
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException x) {
            java.lang.Thread.currentThread().interrupt();
        }
    } 
}