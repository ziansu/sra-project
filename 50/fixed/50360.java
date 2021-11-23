public void onPauseGraphThread() {
    boolean retry = true;
    while (retry) {
        try {
            thread.join();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        retry = false;
        thread = null;
    } 
}