@org.springframework.kafka.annotation.KafkaListener(id = "buz", topics = "annotated10", containerFactory = "kafkaJsonListenerContainerFactory")
public void listen6(org.springframework.kafka.annotation.EnableKafkaIntegrationTests.Foo foo) {
    this.foo = foo;
    this.latch6.countDown();
}