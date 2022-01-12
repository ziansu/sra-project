@java.lang.Override
public void startRunningLocked(long elapsedRealtimeMs) {
    super.startRunningLocked(elapsedRealtimeMs);
    if (((mNesting) == 1) && (mTimeBase.isRunning())) {
        mStartTimeMs = (mTimeBase.getRealtime((elapsedRealtimeMs * 1000))) / 1000;
    }
}