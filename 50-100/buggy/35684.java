private void onMessageNotification(org.json.JSONObject json) {
    java.lang.String notificationId = null;
    try {
        notificationId = json.getString(com.pictureit.noambaroz.beautyapp.gcm.GcmIntentService.ORDER_ID);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    if (notificationId != null)
        com.pictureit.noambaroz.beautyapp.data.DataUtil.pushOrderNotificationIdToTable(getApplicationContext(), notificationId);
    
}