private void report(boolean force) {
    long now = java.lang.System.currentTimeMillis();
    elapsedInterval = now - (lastStatsTime);
    if (((elapsedInterval) >= (interval)) || force) {
        elapsedTotal += elapsedInterval;
        report(now);
        reset(now);
    }
}