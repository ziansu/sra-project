private void report() {
    long now = java.lang.System.currentTimeMillis();
    elapsedInterval = now - (lastStatsTime);
    if ((elapsedInterval) >= (interval)) {
        elapsedTotal += elapsedInterval;
        report(now);
        reset(now);
    }
}