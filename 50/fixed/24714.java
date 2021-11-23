@java.lang.Override
public void onError(java.lang.Throwable e) {
    mDownloadController.setState(new zlc.season.rxdownloadproject.DownloadController.Paused());
}