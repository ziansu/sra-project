@java.lang.Override
public void onDestroy() {
    android.util.Log.d("onDestroy", "Interrupting the wifi");
    stopWifiThread();
    android.util.Log.d("onDestroy", "Stopping the worker thread.");
    stopWorkThread();
    android.util.Log.d("onDestroy", "Removing Listeners.");
    removeFirebaseListeners();
    android.util.Log.d("onDestroy", "Stopping foreground service.");
    stopForeground(true);
    android.util.Log.d("onDestroy", "Releasing wakelock.");
    wakeLock.release();
    stopSelf();
    super.onDestroy();
}