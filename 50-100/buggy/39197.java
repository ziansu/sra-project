private void unsubscribeFromTopics(org.json.JSONArray topics, java.lang.String registrationToken) {
    if (topics != null) {
        java.lang.String topic = null;
        for (int i = 0; i < (topics.length()); i++) {
            topic = topics.optString(i, null);
            if (topic != null) {
                android.util.Log.d(com.adobe.phonegap.push.PushPlugin.LOG_TAG, ("Unsubscribing to topic: " + topic));
                com.google.firebase.messaging.FirebaseMessaging.getInstance().unsubscribeFromTopic(topic);
            }
        }
    }
}