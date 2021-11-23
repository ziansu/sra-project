public void start() {
    if (!(this.isRunning())) {
        this.startTime = (java.lang.System.nanoTime()) * (stopwatch.Stopwatch.NANOSECONDS);
        isRunning = true;
    }
}