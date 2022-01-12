@java.lang.Override
public void onDestroy() {
    boolean initialized;
    synchronized(serviceStateLock) {
        mForcedToStop = true;
        initialized = mInitialized;
    }
    if (initialized) {
        org.andstatus.app.util.MyLog.v(this, "onDestroy");
        stopDelayed(true);
    }
    org.andstatus.app.util.MyLog.d(this, "Service destroyed");
    org.andstatus.app.util.MyLog.setNextLogFileName();
}