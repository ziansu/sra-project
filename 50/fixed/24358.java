public void startTimer() {
    if (!(running)) {
        running = true;
        paused = false;
        runThread = new java.lang.Thread(this);
        runThread.start();
    }
}