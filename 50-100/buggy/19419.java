boolean checkAllowNonWakeupDelayLocked(long nowELAPSED) {
    if (mInteractive) {
        return false;
    }
    if ((mLastAlarmDeliveryTime) <= 0) {
        return false;
    }
    if (((mPendingNonWakeupAlarms.size()) > 0) && ((mNextNonWakeupDeliveryTime) > nowELAPSED)) {
        return false;
    }
    long timeSinceLast = nowELAPSED - (mLastAlarmDeliveryTime);
    return timeSinceLast <= (currentNonWakeupFuzzLocked(nowELAPSED));
}