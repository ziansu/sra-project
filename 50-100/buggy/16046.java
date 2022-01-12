private void reportGauge(io.dropwizard.metrics.graphite.MetricName name, io.dropwizard.metrics.Gauge gauge, long timestamp) throws java.io.IOException {
    java.lang.String valueToReport;
    java.lang.Object value = gauge.getValue();
    valueToReport = format(gauge.getValue());
    if (valueToReport != null) {
        graphite.send(prefix(name), valueToReport, timestamp);
    }
}