void origanizeNoti(java.util.ArrayList<com.sicco.erp.model.NotificationModel> data, int notification_count) {
    sereprateList(data, notification_count);
    com.sicco.erp.HomeActivity.NotifyBR notifyBR = new com.sicco.erp.HomeActivity.NotifyBR();
    android.content.IntentFilter intentFilter = new android.content.IntentFilter("acb");
    registerReceiver(notifyBR, intentFilter);
    android.content.Intent i = new android.content.Intent("acb");
    sendBroadcast(i);
}