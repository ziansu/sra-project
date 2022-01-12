@java.lang.Override
protected co.cask.cdap.kafka.flow.KafkaMessage<java.lang.Long> computeNext() {
    while (messages.hasNext()) {
        kafka.message.MessageAndOffset messageAndOffset = messages.next();
        if ((messageAndOffset.offset()) < fetchReadOffset) {
            continue;
        }
        kafka.message.Message message = messageAndOffset.message();
        return new co.cask.cdap.kafka.flow.KafkaMessage(topicPartition, messageAndOffset.nextOffset(), message.key(), message.payload());
    } 
    return endOfData();
}