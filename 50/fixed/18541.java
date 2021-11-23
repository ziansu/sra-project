public static synchronized fast.simple.download.DownloadManager getInstance(android.content.Context context) {
    if (null == (fast.simple.download.DownloadManager.mInstance)) {
        fast.simple.download.DownloadManager.mInstance = new fast.simple.download.DownloadManager(context);
    }
    return fast.simple.download.DownloadManager.mInstance;
}