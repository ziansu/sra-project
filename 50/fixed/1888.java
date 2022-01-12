public void stop() {
    if (this.isRunning()) {
        this.endTime = java.lang.System.nanoTime();
        isRunning = false;
    }
}