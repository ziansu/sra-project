@java.lang.Override
public org.deidentifier.arx.metric.Metric<?> createInstance(org.deidentifier.arx.metric.MetricConfiguration config) {
    boolean journalist = (config.getAttackerModel()) == (org.deidentifier.arx.metric.MetricConfiguration.MetricConfigurationAttackerModel.JOURNALIST);
    return org.deidentifier.arx.metric.Metric.createPublisherPayoutMetric(journalist, config.getGsFactor());
}