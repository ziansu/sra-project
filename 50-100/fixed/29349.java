@java.lang.Override
public void onCreate() {
    super.onCreate();
    settings = nya.miku.wishmaster.common.MainApplication.getInstance().settings;
    downloadingLocker = nya.miku.wishmaster.common.MainApplication.getInstance().downloadingLocker;
    tnDownloadingTask = new nya.miku.wishmaster.api.interfaces.CancellableTask.BaseCancellableTask();
    fileCache = nya.miku.wishmaster.common.MainApplication.getInstance().fileCache;
    bitmapCache = nya.miku.wishmaster.common.MainApplication.getInstance().bitmapCache;
    contexts = new java.util.ArrayList<>();
    binder = new nya.miku.wishmaster.ui.gallery.GalleryBackend.MyBinder(this).asBinder();
}