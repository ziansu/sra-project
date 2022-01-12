public boolean onUpdate() {
    boolean isUpdated = false;
    if ((mCount) == 0) {
        mStartTime = java.lang.System.currentTimeMillis();
    }
    if ((mCount) == (GLEngine.FRAME_RATE)) {
        long t = java.lang.System.currentTimeMillis();
        mFps = (t - (mStartTime)) / ((float) (GLEngine.FRATE_PRIOD_MS));
        mCount = 0;
        mStartTime = t;
        isUpdated = true;
    }
    (mCount)++;
    return isUpdated;
}