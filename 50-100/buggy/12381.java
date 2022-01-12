public org.springframework.messaging.Message<java.lang.String> roundRobbin(org.springframework.messaging.Message<java.lang.String> message) {
    br.com.cinq.kafka.sample.kafka.KafkaPartitionerTransformer.rr = ((br.com.cinq.kafka.sample.kafka.KafkaPartitionerTransformer.rr) + 1) % (br.com.cinq.kafka.sample.kafka.KafkaPartitionerTransformer.ROUND_ROBBIN_FACTOR);
    java.lang.System.out.println(("HEADER FOR P" + (br.com.cinq.kafka.sample.kafka.KafkaPartitionerTransformer.rr)));
    return org.springframework.messaging.support.MessageBuilder.withPayload(message.getPayload().concat((" - P" + (br.com.cinq.kafka.sample.kafka.KafkaPartitionerTransformer.rr)))).setHeader("partitionId", br.com.cinq.kafka.sample.kafka.KafkaPartitionerTransformer.rr).build();
}