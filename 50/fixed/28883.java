private void resetThrottlingCounters(long currentTimeMillis) {
    synchronized(mThrottlingCounters) {
        for (int i = 0; i < (mThrottlingCounters.length); i++) {
            mThrottlingCounters[i] = 0;
        }
        mThrottlingIntervalBoundaryMillis = currentTimeMillis + (THROTTLING_TIME_INTERVAL_MILLIS);
    }
}