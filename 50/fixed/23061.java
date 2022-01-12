@org.junit.Test
public void testSimple() throws com.dexels.navajo.script.api.MappableException, com.dexels.navajo.script.api.UserException, java.lang.InterruptedException {
    com.dexels.kafka.api.KafkaPublisher kp = com.dexels.kafka.factory.KafkaClientFactory.createPublisher("cerberus1.sportlink-infra.net:9092,cerberus2.sportlink-infra.net:9094");
    kp.publish("key", "blubblub".getBytes());
    java.lang.Thread.currentThread().sleep(1000);
}