@java.lang.Override
public void run() {
    if ((!(mStarted)) || ((mSpringSystem) == null)) {
        return ;
    }
    long currentTime = android.os.SystemClock.uptimeMillis();
    mSpringSystem.loop((currentTime - (mLastTime)));
    mLastTime = currentTime;
    mHandler.post(mLooperRunnable);
}