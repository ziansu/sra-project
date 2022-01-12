private void subscribeToTopics(org.json.JSONArray topics, java.lang.String registrationToken) {
    if (topics != null) {
        java.lang.String topic = null;
        for (int i = 0; i < (topics.length()); i++) {
            topic = topics.optString(i, null);
            subscribeToTopic(topic, registrationToken);
        }
    }
}