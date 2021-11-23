@org.junit.Test
public void testCreateConnectionFactoryWithZookeeper() throws java.lang.Exception {
    createTopic(org.springframework.integration.kafka.listener.TEST_TOPIC, 1, 1, 1);
    org.springframework.integration.kafka.support.ZookeeperConnect zookeeperConnect = new org.springframework.integration.kafka.support.ZookeeperConnect();
    zookeeperConnect.setZkConnect(kafkaEmbeddedBrokerRule.getZookeeperConnectionString());
    org.springframework.integration.kafka.core.DefaultConnectionFactory connectionFactory = new org.springframework.integration.kafka.core.DefaultConnectionFactory(new org.springframework.integration.kafka.core.ZookeeperConfiguration(zookeeperConnect));
    connectionFactory.afterPropertiesSet();
    org.springframework.integration.kafka.core.Connection connection = connectionFactory.connect(getKafkaRule().getBrokerAddresses()[0]);
    org.junit.Assert.assertNotNull(connection);
}