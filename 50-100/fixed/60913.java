private void cancel() {
    if ((notificationManager) != null) {
        notificationManager.cancel(cw.kop.autobackground.files.DownloadThread.NOTIFICATION_ID);
    }
    android.content.Intent resetDownloadIntent = new android.content.Intent(FileHandler.DOWNLOAD_TERMINATED);
    android.support.v4.content.LocalBroadcastManager.getInstance(appContext).sendBroadcast(resetDownloadIntent);
    appContext = null;
    cw.kop.autobackground.settings.AppSettings.checkUsedLinksSize();
    cw.kop.autobackground.files.FileHandler.setIsDownloading(false);
}