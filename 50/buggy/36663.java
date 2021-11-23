@java.lang.Override
protected void onResume() {
    super.onResume();
    final android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (this.getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.cancelAll();
}