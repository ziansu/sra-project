@java.lang.Override
public org.darkphoenixs.kafka.core.KafkaMessageSender<K, V> getSender() {
    if ((sender) == null)
        sender = new org.darkphoenixs.kafka.core.KafkaMessageNewSender<K, V>(props);
    
    return sender;
}