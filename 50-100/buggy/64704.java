private void finishWakefulnessChangeIfNeededLocked() {
    if ((mWakefulnessChanging) && (mDisplayReady)) {
        if (((mWakefulness) == (android.os.PowerManagerInternal.WAKEFULNESS_DOZING)) && (((mWakeLockSummary) & (com.android.server.power.PowerManagerService.WAKE_LOCK_DOZE)) == 0)) {
            return ;
        }
        if (((mWakefulness) == (android.os.PowerManagerInternal.WAKEFULNESS_DOZING)) || ((mWakefulness) == (android.os.PowerManagerInternal.WAKEFULNESS_ASLEEP))) {
            logSleepTimeoutRecapturedLocked();
        }
        mWakefulnessChanging = false;
        mNotifier.onWakefulnessChangeFinished();
    }
}