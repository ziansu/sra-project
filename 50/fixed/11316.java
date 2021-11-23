@java.lang.Override
public org.deidentifier.arx.metric.Metric<?> createInstance(org.deidentifier.arx.metric.MetricConfiguration config) {
    return org.deidentifier.arx.metric.Metric.createPublisherPayoutMetric(false, config.getGsFactor());
}