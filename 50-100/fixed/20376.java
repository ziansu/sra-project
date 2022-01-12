public void onMetricRemoved(com.yammer.metrics.core.MetricName metricName) {
    if (!(metricName.getGroup().startsWith("kafka"))) {
        return ;
    }
    com.turn.kafka.metrics.MetricInfo mi = removeMetric(metricName);
    if (mi != null) {
        synchronized(listeners) {
            for (com.turn.kafka.metrics.KafkaMetricsListener listener : listeners) {
                listener.onKafkaMetricRemoved(mi);
            }
        }
    }
}