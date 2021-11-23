private static final java.lang.String buildTopicCounterKey(java.lang.String topic, java.lang.String nodeId) {
    return new java.lang.StringBuilder("tnc").append(":").append(topic).append(":").append(nodeId).toString();
}