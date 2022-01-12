@java.lang.Override
public void process(org.apache.camel.Exchange exchange) throws java.lang.Exception {
    exchange.getIn().setBody("Test Message from Camel Kafka Component Final", java.lang.String.class);
    exchange.getIn().setHeader(KafkaConstants.PARTITION_KEY, 1);
    exchange.getIn().setHeader(KafkaConstants.KEY, "1");
}