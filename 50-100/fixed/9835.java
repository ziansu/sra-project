@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i("LocalService", ((("Received start id " + startId) + ": ") + intent));
    mIsPersistent = true;
    if (intent != null) {
        android.content.Intent target = intent.getParcelableExtra("notificationTarget");
        if (target != null)
            showNotification(target);
        
    }
    return START_STICKY;
}