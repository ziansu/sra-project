public void start() {
    if (!(this.isRunning())) {
        this.startTime = java.lang.System.nanoTime();
        isRunning = true;
    }
}