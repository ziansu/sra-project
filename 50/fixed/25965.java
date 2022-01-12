@java.lang.Override
public void onCreate() {
    mNotificationsQueue = new ie.headway.howtodoit.NotificationQueue();
    mNotificationsFileObserver = new ie.headway.howtodoit.NotificationService.NotificationsFileObserver();
    mScheduledExecutorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    mNotificationsFileObserver.startWatching();
}