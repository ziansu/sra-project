private void tick() {
    advanceTime();
    handleExit();
    updateViews();
    try {
        java.lang.Thread.sleep(tickPause);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    handleEntrance();
}