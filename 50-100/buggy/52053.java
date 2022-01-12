private boolean broadcastDownloadFinished(java.lang.String downloadPath, int bytesDownloaded) {
    boolean success = bytesDownloaded != (-1);
    java.lang.String action = (success) ? com.google.firebase.quickstart.firebasestorage.MyDownloadService.DOWNLOAD_COMPLETED : com.google.firebase.quickstart.firebasestorage.MyDownloadService.DOWNLOAD_ERROR;
    android.content.Intent broadcast = new android.content.Intent(action).putExtra(com.google.firebase.quickstart.firebasestorage.MyDownloadService.EXTRA_DOWNLOAD_PATH, downloadPath).putExtra(com.google.firebase.quickstart.firebasestorage.MyDownloadService.EXTRA_BYTES_DOWNLOADED, bytesDownloaded);
    return android.support.v4.content.LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(broadcast);
}