@java.lang.Override
public void processWatermark(org.apache.flink.streaming.api.watermark.Watermark mark) throws java.lang.Exception {
    this.context.setCurrentWatermark(new org.joda.time.Instant(mark.getTimestamp()));
    java.util.Set<com.dataartisans.flink.dataflow.translation.wrappers.streaming.TimerOrElement> toFire = getTimersReadyToProcess(mark.getTimestamp());
    if (!(toFire.isEmpty())) {
        for (com.dataartisans.flink.dataflow.translation.wrappers.streaming.TimerOrElement timer : toFire) {
            processElementOrTimer(timer);
        }
    }
    output.emitWatermark(mark);
}