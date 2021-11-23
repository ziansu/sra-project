@java.lang.Override
public long getCurrentDurationMsLocked(long elapsedRealtimeMs) {
    long durationMs = mCurrentDurationMs;
    if (((mNesting) > 0) && (mTimeBase.isRunning())) {
        durationMs += ((mTimeBase.getRealtime((elapsedRealtimeMs * 1000))) / 1000) - (mStartTimeMs);
    }
    return durationMs;
}