public void run() {
    try {
        do {
            if (!(updateStopped)) {
                time = (java.lang.System.currentTimeMillis()) - (lastReset);
                update();
            }
            java.lang.Thread.sleep(100);
        } while (!(killThread) );
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}