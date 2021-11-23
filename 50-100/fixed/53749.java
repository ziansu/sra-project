public void computerDelay() {
    update(g);
    drawCheckers();
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    play();
    update(g);
    drawCheckers();
}