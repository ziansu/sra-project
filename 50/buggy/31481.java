public static org.deidentifier.arx.metric.Metric<org.deidentifier.arx.metric.v2.AbstractILMultiDimensional> createPrecomputedEntropyMetric(double threshold, boolean monotonic, org.deidentifier.arx.metric.Metric.AggregateFunction function) {
    if (monotonic) {
        return new org.deidentifier.arx.metric.v2.MetricMDNUEntropyPotentiallyPrecomputed(0.5, threshold, function);
    }else {
        return new org.deidentifier.arx.metric.v2.MetricMDNUNMEntropyPotentiallyPrecomputed(0.5, threshold, function);
    }
}