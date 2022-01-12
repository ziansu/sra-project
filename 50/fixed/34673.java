public void unwatch(java.lang.String topic) {
    if ((watchedTopics.remove(topic)) != null)
        storage.saveValueByKeyAndType(watchedTopicsAsString(), "", ValueType.WATCHED_TOPICS);
    
}