@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    handler = new android.os.Handler();
    downloadManager = git.dzc.downloadmanagerlib.download.DownloadManager.getInstance(getApplicationContext());
    mNotificationManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    initView();
}