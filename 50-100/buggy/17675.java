public void run() {
    long start;
    long elapsed;
    long wait = 0;
    while (isRunning) {
        start = java.lang.System.currentTimeMillis();
        update();
        repaint();
        elapsed = (java.lang.System.currentTimeMillis()) - start;
        wait = (targetTime) - elapsed;
        if (wait < 5) {
            wait = 5;
        }
        try {
            java.lang.Thread.sleep(wait);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
    stop();
}