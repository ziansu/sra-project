@java.lang.Override
public void open() throws java.lang.Exception {
    super.open();
    if ((this.operator) == null) {
        throw new java.lang.RuntimeException("GroupByWindow operator not initialized.");
    }
    com.dataartisans.flink.dataflow.translation.wrappers.streaming.TimestampedCollector<com.dataartisans.flink.dataflow.translation.wrappers.streaming.WindowedValue<com.dataartisans.flink.dataflow.translation.wrappers.streaming.KV<K, VOUT>>> collector = new com.dataartisans.flink.dataflow.translation.wrappers.streaming.TimestampedCollector(output);
    this.context = new ProcessContext(operator, collector);
}