void sereprateList(java.util.ArrayList<com.sicco.erp.model.NotificationModel> data, int notification_count, int type) {
    int size = data.size();
    if (((action) == 1) && (size != 0)) {
        com.sicco.erp.manager.MyNotificationManager myNotificationManager = new com.sicco.erp.manager.MyNotificationManager();
        myNotificationManager.notifyType(getApplicationContext(), data, notification_count);
    }
    if (size == 0) {
        cancelNotification(getApplicationContext(), type);
        saveInt(type, size);
    }
}