@org.junit.After
public void shutdown() throws java.lang.Exception {
    java.lang.reflect.Field f = kafkaUnitServer.getClass().getDeclaredField("broker");
    f.setAccessible(true);
    kafka.server.KafkaServerStartable broker = ((kafka.server.KafkaServerStartable) (f.get(kafkaUnitServer)));
    org.junit.Assert.assertEquals(1024, ((int) (broker.serverConfig().logSegmentBytes())));
    kafkaUnitServer.shutdown();
}