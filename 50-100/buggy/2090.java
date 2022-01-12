private void buildIcon(int type, android.support.v4.app.NotificationCompat.Builder builder) {
    switch (type) {
        case DownloadNotifier.TYPE_ACTIVE :
            builder.setSmallIcon(android.R.drawable.stat_sys_download);
            break;
        case DownloadNotifier.TYPE_WAITING :
        case DownloadNotifier.TYPE_FAILED :
            builder.setSmallIcon(android.R.drawable.stat_sys_warning);
            break;
        case DownloadNotifier.TYPE_SUCCESS :
            builder.setSmallIcon(android.R.drawable.stat_sys_download_done);
            break;
        default :
            break;
    }
}