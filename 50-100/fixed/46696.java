public void run() {
    try {
        java.lang.String topic = data.getString(0);
        subscribeToTopic(topic, com.adobe.phonegap.push.PushPlugin.registration_id);
        callbackContext.success();
    } catch (org.json.JSONException e) {
        callbackContext.error(e.getMessage());
    }
}