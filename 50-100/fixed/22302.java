public void run() {
    for (int i = 0; i < (windows.length); i++) {
        windowsThreads[i].start();
        try {
            java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        } catch (java.lang.InterruptedException e) {
        }
    }
}