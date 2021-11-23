public void onPauseGraphThread() {
    boolean retry = true;
    thread.isRunning = false;
    while (retry) {
        try {
            thread.join();
            retry = false;
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}