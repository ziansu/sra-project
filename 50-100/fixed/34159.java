public void sendNotification(java.lang.String strValue) {
    android.support.v4.app.NotificationCompat.Builder notification = new android.support.v4.app.NotificationCompat.Builder(this).setSmallIcon(R.drawable.nature).setContentTitle("My notification").setContentText(("ALO ALO: " + strValue));
    notification.setDefaults(Notification.DEFAULT_ALL);
    notification.setColor(android.support.v4.content.ContextCompat.getColor(this, R.color.colorTransparent));
    android.app.NotificationManager mNotificationManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    mNotificationManager.notify(OurContract.NOTIFICATION_ID_HUMIDITY, notification.build());
}