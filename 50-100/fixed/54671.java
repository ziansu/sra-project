@java.lang.Override
protected void onPreExecute() {
    createDownloadStartNotification();
    super.onPreExecute();
    android.os.PowerManager pm = ((android.os.PowerManager) (context.getSystemService(Context.POWER_SERVICE)));
    wakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, getClass().getName());
    wakeLock.acquire();
}