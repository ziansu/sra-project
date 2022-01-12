protected void addActionButton(android.support.v4.app.NotificationCompat.Builder builder, short notificationId, java.lang.String action, int iconResId, java.lang.String label, android.os.Bundle notificationData) {
    android.app.PendingIntent moreInfoIntent = createPendingIntent(notificationId, action, notificationData, com.nu.art.cyborg.core.CyborgModule.getNextRandomPositiveShort());
    builder.addAction(iconResId, label, moreInfoIntent);
}