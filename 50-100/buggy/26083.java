@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    java.lang.String url = intent.getStringExtra("url");
    java.lang.String filename = intent.getStringExtra("filename");
    new com.example.por.project_test.DownloadFileService.DownloadTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, url, filename);
    notification = new android.support.v4.app.NotificationCompat.Builder(this).setSmallIcon(android.R.drawable.arrow_down_float).setContentTitle(filename).setAutoCancel(true);
    startForeground(1919, notification.build());
    return android.app.Service.START_STICKY;
}