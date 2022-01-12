public long removeTimeSpent(long timeRemoved) {
    mCurrentMilli -= timeRemoved;
    long overKill = 0;
    if ((mCurrentMilli) < 0) {
        overKill = java.lang.Math.abs(mCurrentMilli);
        mCurrentMilli = 0;
    }
    return overKill;
}