@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.d("Start Command", "Inside");
    CollectData();
    showNotification();
    android.util.Log.d("LocalService", ((("Received start id " + startId) + ": ") + intent));
    android.util.Log.d("On alarm", "test two");
    return START_STICKY_COMPATIBILITY;
}