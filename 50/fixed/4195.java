@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.d(com.sunny.leaveme.services.MonitorService.TAG, "MonitorService onDestroy");
    mSensorReader.stop();
    mLocalBroadcastManager.unregisterReceiver(mLocalBroadcastReceiver);
    unregisterReceiver(mLockScreenReceiver);
    stopMonitorTimer();
    stopScreenBlocker();
}