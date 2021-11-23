private void mojoEnd(org.apache.maven.execution.ExecutionEvent event) {
    final io.takari.maven.timeline.Event timelineMetric = timelineMetrics.get(key(event));
    final io.takari.maven.timeline.buildevents.BuildEventListener.Metric metric = executionMetrics.get(key(event));
    if (metric == null) {
        return ;
    }
    metric.setEnd(millis());
    timelineMetric.setEnd(new org.joda.time.DateTime(org.joda.time.DateTimeZone.UTC).toString());
    timelineMetric.setDuration(millis());
}