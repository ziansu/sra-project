public double getElapsed() {
    if (this.isRunning()) {
        return ((java.lang.System.nanoTime()) * (stopwatch.Stopwatch.NANOSECONDS)) - (this.startTime);
    }else {
        return (this.endTime) - (this.startTime);
    }
}