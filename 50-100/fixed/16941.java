public double getElapsed() {
    if (this.isRunning()) {
        return (stopwatch.Stopwatch.NANOSECONDS) * ((java.lang.System.nanoTime()) - (this.startTime));
    }else {
        return (stopwatch.Stopwatch.NANOSECONDS) * ((this.endTime) - (this.startTime));
    }
}