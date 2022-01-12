protected void addActionButton(int notificationId, java.lang.String action, android.support.v4.app.NotificationCompat.Builder builder, int iconResId, com.nu.art.cyborg.common.interfaces.StringResourceResolver stringResolver, android.os.Bundle notificationData) {
    android.app.PendingIntent moreInfoIntent = createPendingIntent(notificationId, action, notificationData, com.nu.art.cyborg.core.CyborgModule.getNextRandomPositiveShort());
    builder.addAction(iconResId, stringResolver.getString(cyborg), moreInfoIntent);
}