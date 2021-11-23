@java.lang.Override
public void stopRunningLocked(long elapsedRealtimeMs) {
    super.stopRunningLocked(elapsedRealtimeMs);
    if ((mNesting) == 0) {
        final long durationMs = getCurrentDurationMsLocked(elapsedRealtimeMs);
        if (durationMs > (mMaxDurationMs)) {
            mMaxDurationMs = durationMs;
        }
        mStartTimeMs = -1;
        mCurrentDurationMs = 0;
    }
}