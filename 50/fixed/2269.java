public org.deidentifier.arx.metric.MetricConfiguration getConfiguration() {
    return new org.deidentifier.arx.metric.MetricConfiguration(false, super.getGeneralizationSuppressionFactor(), false, 0.0, this.getAggregateFunction());
}