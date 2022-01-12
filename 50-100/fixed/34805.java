@java.lang.Override
protected void onPushReceive(android.content.Context context, android.content.Intent intent) {
    android.os.Bundle extras = intent.getExtras();
    if (extras != null) {
        try {
            java.lang.String jsonData = extras.getString("com.parse.Data");
            org.json.JSONObject json;
            json = new org.json.JSONObject(jsonData);
            sendPushNotification(context, json);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
}