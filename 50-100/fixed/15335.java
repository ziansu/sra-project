@java.lang.Override
public void createTopic(java.lang.String topic, int partitions, int replicationFactor) {
    org.I0Itec.zkclient.ZkClient zookeeperClient = new org.I0Itec.zkclient.ZkClient(zkEndpoint, 10000, 10000, kafka.utils.ZKStringSerializer$.MODULE$);
    kafka.admin.AdminUtils.createTopic(zookeeperClient, topic, partitions, replicationFactor, null);
    com.telefonica.iot.cygnus.backends.kafka.KafkaBackendImpl.LOGGER.debug(((((((("Creating topic: " + topic) + " , partitions: ") + partitions) + " , ") + "replication factor: ") + replicationFactor) + "."));
}