public samuelpalmer.common.notifications.NotificationButtons configureButton(int id, int icon, android.app.PendingIntent onClickIntent, java.lang.CharSequence contentDescription) {
    content.setImageViewResource(id, icon);
    content.setInt(id, "setColorFilter", actionButtonColour(icon));
    content.setOnClickPendingIntent(id, onClickIntent);
    if ((android.os.Build.VERSION.SDK_INT) >= 15)
        content.setContentDescription(id, contentDescription);
    
    return this;
}