private void createDownloadStartNotification() {
    notificationCompat.setSmallIcon(R.mipmap.ic_launcher_1);
    notificationCompat.setContentTitle(context.getString(R.string.lang_downloading));
    notificationCompat.setContentText(context.getString(R.string.download_starts));
    notificationCompat.setStyle(inboxStyle);
    mNotificationManager.notify(1, notificationCompat.build());
}