@android.support.annotation.Nullable
private java.lang.Integer parseColor(com.google.firebase.messaging.RemoteMessage.Notification fcmNotification) {
    java.lang.String notificationColor = fcmNotification.getColor();
    java.lang.Integer color = null;
    if (notificationColor != null) {
        try {
            color = android.graphics.Color.parseColor(notificationColor);
        } catch (java.lang.IllegalArgumentException ignore) {
        }
        if (color == null) {
            int colorResId = getResourceIdFromApplicationMetadata("com.google.firebase.messaging.default_notification_color");
            if (colorResId != 0)
                color = android.support.v4.content.ContextCompat.getColor(context, colorResId);
            
        }
    }
    return color;
}