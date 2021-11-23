@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.d("testing", "onStartCommand");
    return START_STICKY;
}