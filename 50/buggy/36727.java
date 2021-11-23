@org.springframework.kafka.annotation.KafkaListener(id = "buz", topics = "annotated10", containerFactory = "kafkaJsonListenerContainerFactory")
public void listen6(org.springframework.kafka.annotation.EnableKafkaIntegrationTests.Foo foo, org.springframework.kafka.support.Acknowledgment ack) {
    this.foo = foo;
    this.ack = ack;
    this.latch6.countDown();
}