@java.lang.Override
protected java.net.HttpURLConnection performAction(java.net.HttpURLConnection connection, long timestamp) throws java.io.IOException {
    org.elasticsearch.metrics.JsonMetric jsonMetric = new org.elasticsearch.metrics.JsonStartTime(com.codahale.metrics.MetricRegistry.name(prefix, "metricStart"), timestamp);
    connection = writeJsonMetricAndRecreateConnectionIfNeeded(jsonMetric, connection, new java.util.concurrent.atomic.AtomicInteger(0));
    return connection;
}