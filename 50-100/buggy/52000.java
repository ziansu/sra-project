private void resetToDefault() {
    edu.ucla.cens.systemlog.Log.i(edu.ucla.cens.accelservice.AccelService.TAG, "Resetting variables to default");
    mRate = edu.ucla.cens.accelservice.AccelService.DEFAULT_RATE;
    mSleepInterval = edu.ucla.cens.accelservice.AccelService.DEFAULT_SLEEP_INTERVAL;
    mReadInterval = edu.ucla.cens.accelservice.AccelService.DEFAULT_READ_INTERVAL;
    mWarmupInterval = edu.ucla.cens.accelservice.AccelService.DEFAULT_WARMUP_INTERVAL;
    synchronized(mLastListX) {
        mLastForceList = null;
        mLastListX = null;
        mLastListY = null;
        mLastListZ = null;
    }
}