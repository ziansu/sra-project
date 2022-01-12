private void startFlushTimer() {
    flushTimer = new java.util.Timer();
    flushTimer.schedule(flushTimerTask, bufferIntervalMs);
}