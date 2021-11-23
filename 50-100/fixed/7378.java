private <T extends com.librato.metrics.reporter.Metric> T register(java.lang.Class<T> klass, com.librato.metrics.reporter.Supplier<T> metric) {
    com.librato.metrics.reporter.Signal signal = createSignal();
    if (signal == null) {
        return register(registry, name, metric, klass);
    }
    java.lang.String encodedName = encodeName(signal);
    return register(registry, encodedName, metric, klass);
}