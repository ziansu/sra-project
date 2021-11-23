@java.lang.Override
public void run() {
    mbActive = true;
    try {
        int waited = 0;
        while ((mbActive) && (waited < (TIMER_RUNTIME))) {
            java.lang.Thread.sleep(200);
            if (mbActive) {
                waited += 200;
                updateProgress(waited);
            }
        } 
    } catch (java.lang.InterruptedException e) {
    } finally {
        onContinue();
    }
}