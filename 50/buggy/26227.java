@java.lang.Override
public void prepare(@java.lang.SuppressWarnings(value = "rawtypes")
java.util.Map stormConf, org.apache.storm.task.TopologyContext context) {
    super.prepare(stormConf, context);
    this.countMetric = new org.apache.storm.metric.api.CountMetric();
    context.registerMetric(this.metricName, this.countMetric, this.metricTimeBucketSizeInSecs);
}