@java.lang.Override
public void stopRunningLocked(long elapsedRealtimeMs) {
    if ((mNesting) == 1) {
        final long durationMs = getCurrentDurationMsLocked(elapsedRealtimeMs);
        if (durationMs > (mMaxDurationMs)) {
            mMaxDurationMs = durationMs;
        }
        mStartTimeMs = -1;
        mCurrentDurationMs = 0;
    }
    super.stopRunningLocked(elapsedRealtimeMs);
}