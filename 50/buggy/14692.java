public long removeTimeSpent(long timeRemoved) {
    mCurrentMilli -= timeRemoved;
    long overKill = mCurrentMilli;
    if ((mCurrentMilli) < 0) {
        mCurrentMilli = 0;
    }
    return overKill;
}