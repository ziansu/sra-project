private org.apache.activemq.command.ProducerId getNextProducerId() {
    return new org.apache.activemq.command.ProducerId(sessionId, ((nextProducerId)++));
}