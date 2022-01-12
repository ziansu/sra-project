public samuelpalmer.common.notifications.NotificationButtons configureButton(int icon, android.app.PendingIntent onClickIntent, java.lang.CharSequence contentDescription) {
    android.widget.RemoteViews button = new android.widget.RemoteViews(context.getPackageName(), R.layout.notification_button);
    button.setImageViewResource(R.id.notification_button, icon);
    button.setInt(R.id.notification_button, "setColorFilter", actionButtonColour(icon));
    button.setOnClickPendingIntent(R.id.notification_button, onClickIntent);
    if ((android.os.Build.VERSION.SDK_INT) >= 15)
        button.setContentDescription(R.id.notification_button, contentDescription);
    
    content.addView(R.id.notification_buttons_container, button);
    return this;
}