public void run() {
    setPosx(getX());
    setPosy(getY());
    setRunning(true);
    setMoveTime(java.lang.System.currentTimeMillis());
    while (isRunning()) {
        try {
            java.lang.Thread.sleep(frogger.REFRESH_RATE);
            update();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}