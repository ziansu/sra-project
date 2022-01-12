void shutdownEmulator() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    mLastFpsChangedTime = calendar.get(java.util.Calendar.SECOND);
    android.util.Log.e("CoreService", "STARTING TIMER 1");
    mFpsCangedHandler.postDelayed(mLastFpsChangedChecker, 500);
    mIsShuttingDown = true;
    updateNotification();
    paulscode.android.mupen64plusae.jni.NativeExports.emuStop();
}