@java.lang.Override
public void onCreate() {
    android.widget.Toast.makeText(this, "notification service created", Toast.LENGTH_LONG).show();
    mNotificationsQueue = new ie.headway.howtodoit.NotificationQueue();
    mNotificationsFileObserver = new ie.headway.howtodoit.NotificationService.NotificationsFileObserver();
    mScheduledExecutorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    mNotificationsFileObserver.startWatching();
}