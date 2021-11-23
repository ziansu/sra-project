@java.lang.Override
public org.apache.flink.api.java.tuple.Tuple2<java.lang.String, java.lang.Long> map(org.apache.flink.api.java.tuple.Tuple2<java.lang.String, java.lang.Long> value) throws java.lang.Exception {
    com.intel.hibench.common.streaming.metrics.KafkaReporter kafkaReporter = new com.intel.hibench.common.streaming.metrics.KafkaReporter(config.reportTopic, config.brokerList);
    long time = java.lang.System.currentTimeMillis();
    java.lang.System.out.println((("Latency :" + (time - (value.f1))) + " ms"));
    kafkaReporter.report(value.f1, time);
    return value;
}