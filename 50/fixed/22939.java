@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    nuclei3.notifications.NotificationManager.dismiss(intent);
}