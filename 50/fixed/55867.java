@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    handleStart(intent);
    return START_NOT_STICKY;
}