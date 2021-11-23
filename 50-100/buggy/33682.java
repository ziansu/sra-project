private void getRegularRandomInterval() {
    long interval = (mDefinedMinRandomValue) + ((long) ((mRandomGen.nextDouble()) * (((mDefinedMaxRandomValue) - (mDefinedMinRandomValue)) + 1)));
    interval = interval - (interval % 1000);
    if (interval <= (mCurrentTimerValue)) {
        interval = mCurrentTimerValue;
    }
    mNextIntervalValue = interval;
}