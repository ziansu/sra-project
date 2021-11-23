@java.lang.Override
public void onTimer(java.lang.String timerId, org.apache.beam.sdk.transforms.windowing.BoundedWindow window, org.joda.time.Instant timestamp, org.apache.beam.sdk.state.TimeDomain timeDomain) {
    try (java.io.Closeable ignored = org.apache.beam.sdk.metrics.MetricsEnvironment.scopedMetricsContainer(metricsReporter.getMetricsContainer(stepName))) {
        delegate.onTimer(timerId, window, timestamp, timeDomain);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
    metricsReporter.updateMetrics();
}