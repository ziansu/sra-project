private void subscribeToTopics(org.json.JSONArray topics, java.lang.String registrationToken) throws java.io.IOException {
    if (topics != null) {
        java.lang.String topic = null;
        for (int i = 0; i < (topics.length()); i++) {
            topic = topics.optString(i, null);
            if (topic != null) {
                android.util.Log.d(com.adobe.phonegap.push.PushPlugin.LOG_TAG, ("Subscribing to topic: " + topic));
                com.google.firebase.messaging.FirebaseMessaging.getInstance().subscribeToTopic(topic);
            }
        }
    }
}