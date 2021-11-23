private void setNextWatermarkTimer(org.apache.flink.streaming.api.operators.StreamingRuntimeContext runtime) {
    long timeToNextWatermark = getTimeToNextWaternark();
    runtime.registerTimer(timeToNextWatermark, this);
}