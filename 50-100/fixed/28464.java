@java.lang.Override
public void onCreate() {
    super.onCreate();
    downloadingQueue = new java.util.concurrent.LinkedBlockingQueue<nya.miku.wishmaster.ui.downloading.DownloadingService.DownloadingQueueItem>();
    nya.miku.wishmaster.ui.downloading.DownloadingService.sQueue = downloadingQueue;
    binder = new nya.miku.wishmaster.ui.downloading.DownloadingService.DownloadingServiceBinder(this);
    notificationManager = ((android.app.NotificationManager) (getSystemService(nya.miku.wishmaster.ui.downloading.NOTIFICATION_SERVICE)));
    settings = nya.miku.wishmaster.common.MainApplication.getInstance().settings;
    fileCache = nya.miku.wishmaster.common.MainApplication.getInstance().fileCache;
    downloadingLocker = nya.miku.wishmaster.common.MainApplication.getInstance().downloadingLocker;
    bitmapCache = nya.miku.wishmaster.common.MainApplication.getInstance().bitmapCache;
    nya.miku.wishmaster.common.Logger.d(nya.miku.wishmaster.ui.downloading.DownloadingService.TAG, "created downloading service");
}