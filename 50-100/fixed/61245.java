@java.lang.Override
public void open() throws java.lang.Exception {
    super.open();
    if ((this.operator) == null) {
        throw new java.lang.RuntimeException("GroupByWindow operator not initialized.");
    }
    this.context = new ProcessContext(operator, new com.dataartisans.flink.dataflow.translation.wrappers.streaming.TimestampedCollector(output));
}