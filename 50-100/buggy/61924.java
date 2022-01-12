public com.example.homeguard.dto.DownloadedMotionDataInfo perform() {
    com.example.homeguard.dto.DownloadedMotionDataInfo downloadedMotionDataInfo = null;
    try {
        downloadedMotionDataInfo = downloadWithPagination(AppParams.MOTION_DOWNLOAD_URL);
    } catch (java.lang.Exception e) {
        android.util.Log.e(com.example.homeguard.DownloadMotionDataTask.TAG, e.getMessage(), e);
    }
    downloadPassingMotionImages();
    if ((downloadedMotionDataInfo != null) && (downloadedMotionDataInfo.getNew())) {
        makeNotification();
    }
    return downloadedMotionDataInfo;
}