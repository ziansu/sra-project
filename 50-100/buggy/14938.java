public org.helios.ot.trace.Trace traceDelta(long value, java.lang.String metricName, java.lang.String... nameSpace) {
    java.lang.Number deltaValue = org.helios.ot.deltas.DeltaManager.getInstance().delta(buildMetricName(metricName, nameSpace), value, MetricType.DELTA_INT_AVG);
    if (deltaValue != null) {
        org.helios.ot.trace.Trace.Builder builder = org.helios.ot.trace.Trace.build(deltaValue.longValue(), MetricType.DELTA_LONG_AVG, metricName).segment(nameSpace).format(this);
        if (builder != null)
            return builder.build();
        
    }
    return null;
}