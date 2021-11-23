@java.lang.Override
public void resume(cn.woblog.android.downloader.domain.DownloadInfo downloadInfo) {
    if (isExecute()) {
        downloadInfo.setStatus(DownloadInfo.STATUS_PAUSED);
        cacheDownloadTask.remove(downloadInfo.getId());
        download(downloadInfo);
    }
}