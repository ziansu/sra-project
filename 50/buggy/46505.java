public java.util.Timer getTimer(final java.lang.String metricName) {
    java.util.SortedMap<java.lang.String, java.util.Timer> timers = registry.getTimers();
    java.util.Timer timer = registry.timer(metricName);
    return timer;
}