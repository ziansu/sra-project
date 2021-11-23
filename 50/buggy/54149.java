public void setInValue(com.dataartisans.flink.dataflow.translation.wrappers.streaming.TimerOrElement<com.dataartisans.flink.dataflow.translation.wrappers.streaming.WindowedValue<com.dataartisans.flink.dataflow.translation.wrappers.streaming.KV<K, VIN>>> value, com.dataartisans.flink.dataflow.translation.wrappers.streaming.FlinkStateInternals stateForKey) {
    this.element = value;
    this.stateInternals = stateForKey;
    this.timerInternals.setElement(value);
}