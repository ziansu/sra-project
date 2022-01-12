long stop() {
    mElapsedTime += (java.lang.System.currentTimeMillis()) - (mStartTime);
    mStartTime = -1;
    return mElapsedTime;
}