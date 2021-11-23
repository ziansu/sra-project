public void stopThread() {
    mRunning = false;
    pausePlay(true);
    synchronized(this) {
        this.interrupt();
    }
}