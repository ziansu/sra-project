void sereprateList(java.util.ArrayList<com.sicco.erp.model.NotificationModel> data, int notification_count) {
    int size = data.size();
    if (((action) == 1) && (size != 0)) {
        com.sicco.erp.manager.MyNotificationManager myNotificationManager = new com.sicco.erp.manager.MyNotificationManager();
        myNotificationManager.notifyType(getApplicationContext(), data, notification_count);
    }
    if (size == 0) {
        int type = data.get(0).getNotify_type();
        cancelNotification(getApplicationContext(), type);
        saveInt(type, size);
    }
}