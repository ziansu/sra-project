private kafka.javaapi.consumer.SimpleConsumer createSimpleConsumer(java.lang.String broker) {
    java.util.List<java.lang.String> hostPort = com.google.common.base.Splitter.on(':').trimResults().omitEmptyStrings().splitToList(broker);
    return createSimpleConsumer(hostPort.get(0), java.lang.Integer.valueOf(hostPort.get(1)));
}