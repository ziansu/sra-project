public void watch(java.lang.String topic) {
    watchedTopics.put(topic, new com.ChewieLouie.Topical.Topic(topic));
    storage.saveValueByKeyAndType(watchedTopicsAsString(), "", ValueType.WATCHED_TOPICS);
}