@java.lang.Override
public shtykh.topic.data.Topic get(java.lang.String topicName) throws shtykh.topic.provider.ProviderException {
    java.io.File lastTimestampDir = getTheLastTimestampDir(topicName);
    if (lastTimestampDir == null) {
        cache.remove(topicName);
        return null;
    }else {
        shtykh.topic.data.Topic topic = cache.get(topicName);
        if (needToCache(topic, lastTimestampDir.getName())) {
            cache.put(topicName, readTopic(topicName, lastTimestampDir));
        }
        return cache.get(topicName);
    }
}