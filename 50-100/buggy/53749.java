public void computerDelay() {
    update(g);
    drawCheckers();
    if ((selectedMode) == 1) {
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        play();
        update(g);
        drawCheckers();
    }
}