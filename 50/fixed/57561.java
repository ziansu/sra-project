private void populateWatchedTopicsSet() {
    java.util.List<java.lang.String> topicStrings = com.ChewieLouie.Topical.StringUtils.split(storage.loadValueByKeyAndType("", ValueType.WATCHED_TOPICS), com.ChewieLouie.Topical.TopicWatcher.seperator);
    for (java.lang.String topic : topicStrings)
        watchedTopics.put(topic, new com.ChewieLouie.Topical.Topic(topic));
    
}