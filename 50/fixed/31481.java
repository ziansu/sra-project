public static org.deidentifier.arx.metric.Metric<org.deidentifier.arx.metric.v2.AbstractILMultiDimensional> createPrecomputedEntropyMetric(double threshold, boolean monotonic, org.deidentifier.arx.metric.Metric.AggregateFunction function) {
    if (monotonic) {
        return new org.deidentifier.arx.metric.v2.MetricMDNUEntropyPotentiallyPrecomputed(threshold, 0.5, function);
    }else {
        return new org.deidentifier.arx.metric.v2.MetricMDNUNMEntropyPotentiallyPrecomputed(threshold, 0.5, function);
    }
}