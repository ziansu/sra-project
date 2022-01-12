public void run() {
    main.model.Stats stats = new main.model.Stats(taxiData, windows);
    for (int i = 0; i < (windows.length); i++) {
        windowsThreads[i].start();
        try {
            java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        } catch (java.lang.InterruptedException e) {
        }
    }
}