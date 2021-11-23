@java.lang.Override
public void post() {
    fetchMessages();
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (getContext().getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.cancel(0);
}