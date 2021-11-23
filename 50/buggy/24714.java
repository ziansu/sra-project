@java.lang.Override
public void onError(java.lang.Throwable e) {
    android.util.Log.w("TAG", e);
    mDownloadController.setState(new zlc.season.rxdownloadproject.DownloadController.Paused());
}