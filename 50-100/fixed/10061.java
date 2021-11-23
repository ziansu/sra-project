public void addNotification(@com.flair.blurb.Constants.CategoryDef
java.lang.String category, android.service.notification.StatusBarNotification notification, android.service.notification.NotificationListenerService service) {
    java.lang.String key = com.flair.blurb.Util.getKey(notification);
    android.util.Log.d(com.flair.blurb.data.Notifications.TAG, ((("addNotification: " + category) + " key ") + key));
    java.util.concurrent.ConcurrentHashMap<java.lang.String, android.service.notification.StatusBarNotification> map = getMapByCategory(category);
    com.flair.blurb.Util.mergeNotifications(map, notification, service);
    map.put(com.flair.blurb.Util.getKey(notification), notification);
}