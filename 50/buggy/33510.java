@org.junit.Before
@org.junit.After
public void clearMetricRegistry() {
    org.stagemonitor.core.metrics.annotations.MeteredInstrumenter.init();
    org.stagemonitor.core.metrics.annotations.TimedInstrumenter.init();
    org.stagemonitor.core.Stagemonitor.getMetric2Registry().removeMatching(MetricFilter.ALL);
}