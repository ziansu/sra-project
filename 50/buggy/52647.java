@java.lang.Override
public int onStartCommand(final android.content.Intent intent, final int flags, final int startId) {
    android.widget.Toast.makeText(this, "notification service started", Toast.LENGTH_LONG).show();
    invalidateNotificationsQueue();
    return START_STICKY;
}