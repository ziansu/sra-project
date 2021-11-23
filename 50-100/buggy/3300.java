@java.lang.Override
@android.support.annotation.UiThread
public void newDownloadIndexes() {
    visibleBanner.updateBannerInProgress();
    for (java.lang.ref.WeakReference<android.support.v4.app.Fragment> ref : fragSet) {
        android.support.v4.app.Fragment f = ref.get();
        if (f.isAdded()) {
            if (f instanceof net.osmand.plus.download.DownloadIndexesThread.DownloadEvents) {
                ((net.osmand.plus.download.DownloadIndexesThread.DownloadEvents) (f)).newDownloadIndexes();
            }
        }
    }
    downloadHasFinished();
}