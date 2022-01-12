@java.lang.Override
public void onCreate() {
    mNotificationManager = android.support.v4.app.NotificationManagerCompat.from(getApplicationContext());
    showNotification();
}