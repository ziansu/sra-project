private org.apache.kafka.common.network.KafkaChannel channelOrFail(java.lang.String id) {
    org.apache.kafka.common.network.KafkaChannel channel = this.channels.get(id);
    if (channel == null)
        throw new java.lang.IllegalStateException(((("Attempt to retrieve channel for which there is no open connection. Connection id " + id) + " existing connections ") + (channels.keySet())));
    
    return channel;
}