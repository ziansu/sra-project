private org.json.JSONObject sendPlan(int type, java.lang.String topicName, java.lang.String notifyMsg, java.lang.String data) {
    org.json.JSONObject plan = null;
    try {
        plan = new org.json.JSONObject(data);
    } catch (org.json.JSONException e) {
        android.util.Log.e("BAD JSON", "params[3] was not a JSON Object!");
        e.printStackTrace();
    }
    org.json.JSONObject notification = createNotification(type, topicName, notifyMsg, plan);
    android.util.Log.v("SEND PLAN:", notification.toString());
    return notification;
}