public static void startDownload() {
    android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(android.net.Uri.parse(ru.dzgeorgy.versioncheck.VersionUpdateDialog.DOWNLOAD_LINK));
    request.setTitle(ru.dzgeorgy.versioncheck.VersionUpdateDialog.FILE_NAME);
    request.allowScanningByMediaScanner();
    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, ru.dzgeorgy.versioncheck.VersionUpdateDialog.FILE_NAME);
    android.app.DownloadManager manager = ((android.app.DownloadManager) (ru.dzgeorgy.versioncheck.VersionUpdate.systemService));
    manager.enqueue(request);
}