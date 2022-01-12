@android.annotation.SuppressLint(value = "NewApi")
private android.os.Bundle getExtras(android.app.Notification notification) {
    if (com.achep.acdisplay.Device.hasKitKatApi()) {
        return notification.extras;
    }
    try {
        java.lang.reflect.Field field = android.app.Notification.class.getDeclaredField("extras");
        field.setAccessible(true);
        return ((android.os.Bundle) (field.get(notification)));
    } catch (java.lang.Exception e) {
        android.util.Log.w(com.achep.acdisplay.notifications.parser.Extractor.TAG, "Failed to access extras on Jelly Bean.");
        return null;
    }
}