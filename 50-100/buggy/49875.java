@java.lang.Override
public void processElement(org.apache.beam.sdk.util.WindowedValue<InputT> elem) {
    try (java.io.Closeable ignored = org.apache.beam.sdk.metrics.MetricsEnvironment.scopedMetricsContainer(metricsReporter.getMetricsContainer(stepName))) {
        delegate.processElement(elem);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
    metricsReporter.updateMetrics();
}