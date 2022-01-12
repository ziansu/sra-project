private synchronized void handleMoveDown() {
    if (!(moveThreadRunning)) {
        startRepeatThread();
    }
}