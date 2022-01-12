@java.lang.Override
public java.lang.Long call() throws java.lang.Exception {
    java.util.Collection<co.cask.cdap.api.metrics.MetricTimeSeries> metricTimeSeries = co.cask.cdap.logging.save.LogSaverPluginTest.metricStore.query(new co.cask.cdap.api.metrics.MetricDataQuery((timeInSecs - (java.util.concurrent.TimeUnit.HOURS.toSeconds(10))), timeInSecs, 60, "system.app.log.warn", co.cask.cdap.api.dataset.lib.cube.AggregationFunction.SUM, sliceByTags, com.google.common.collect.ImmutableList.<java.lang.String>of()));
    return metricTimeSeries.isEmpty() ? 0L : metricTimeSeries.iterator().next().getTimeValues().get(0).getValue();
}