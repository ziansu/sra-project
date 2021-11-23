void sereprateCacLoaiList(java.util.ArrayList<com.sicco.erp.model.Dispatch> data, int notification_count) {
    int size = data.size();
    if (((action) == 1) && (size != 0)) {
        com.sicco.erp.manager.MyNotificationManager myNotificationManager = new com.sicco.erp.manager.MyNotificationManager();
        myNotificationManager.notifyCacLoai(getApplicationContext(), data, notification_count);
    }
    if (size == 0) {
        cancelNotification(getApplicationContext(), 3);
        saveInt(3, size);
    }
}