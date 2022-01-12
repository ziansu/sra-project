@java.lang.Override
public boolean topicExists(java.lang.String topic) throws java.lang.Exception {
    com.telefonica.iot.cygnus.backends.kafka.KafkaBackendImpl.LOGGER.debug((("Checking if topic '" + topic) + "' already exists."));
    return kafka.admin.AdminUtils.topicExists(zookeeperClient, topic);
}