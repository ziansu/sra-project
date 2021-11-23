@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    createDownloadStartNotification();
    android.os.PowerManager pm = ((android.os.PowerManager) (context.getSystemService(Context.POWER_SERVICE)));
    wakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, getClass().getName());
    wakeLock.acquire();
}