private void setNextWatermarkTimer() {
    long timeToNextWatermark = getTimeToNextWaternark();
    runtime.registerTimer(timeToNextWatermark, this);
}