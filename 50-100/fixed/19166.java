public synchronized void start() {
    if ((mState) == (State.TIMER_RUNNING)) {
        return ;
    }
    if ((mMillisInFuture) <= 0) {
        onFinish();
        return ;
    }
    mTotalPausedFly = 0;
    mMillisStart = android.os.SystemClock.elapsedRealtime();
    mState = State.TIMER_RUNNING;
    mStopTimeInFuture = (mMillisStart) + (mMillisInFuture);
    onStart(mMillisInFuture);
    mHandler.sendEmptyMessage(dev.xesam.android.toolbox.timer.CountDownTimer.MSG);
}