@java.lang.Override
public void onCreate() {
    super.onCreate();
    binder = new nya.miku.wishmaster.ui.posting.PostingService.PostingServiceBinder(this);
    notificationManager = ((android.app.NotificationManager) (getSystemService(nya.miku.wishmaster.ui.posting.NOTIFICATION_SERVICE)));
    nya.miku.wishmaster.common.Logger.d(nya.miku.wishmaster.ui.posting.PostingService.TAG, "created posting service");
}