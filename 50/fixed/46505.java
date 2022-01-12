public java.util.Timer getTimer(final java.lang.String metricName) {
    return registry.timer(metricName);
}