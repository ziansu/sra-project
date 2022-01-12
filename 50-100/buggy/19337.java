private static int getNotificationIcon(android.content.Context context) {
    boolean useWhiteIcon = (android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.LOLLIPOP);
    java.lang.String resourceName = (useWhiteIcon) ? "icon_silhouette" : "ic_launcher";
    int id = context.getResources().getIdentifier(resourceName, "mipmap", context.getPackageName());
    if (id == 0) {
        com.ee.notification.NotificationUtils._logger.error(("Could not find resource id for icon name: " + resourceName));
    }
    return id;
}