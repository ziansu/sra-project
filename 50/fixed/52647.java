@java.lang.Override
public int onStartCommand(final android.content.Intent intent, final int flags, final int startId) {
    invalidateNotificationsQueue();
    return START_STICKY;
}