@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    startService(intent);
    stopSelf();
    return START_NOT_STICKY;
}