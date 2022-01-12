private android.app.Notification createNotification(final android.app.PendingIntent pendingIntent) {
    android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(mContext.getApplicationContext());
    builder.setContentIntent(pendingIntent);
    builder.setTicker(mContext.getString(R.string.overlay_preview_ticker));
    builder.setSmallIcon(R.drawable.dconnect_icon);
    builder.setContentTitle(mContext.getString(R.string.overlay_preview_content_title));
    builder.setContentText(mContext.getString(R.string.overlay_preview_content_message));
    builder.setWhen(java.lang.System.currentTimeMillis());
    builder.setAutoCancel(true);
    return builder.build();
}