public void acknowledgeMessage(long deliveryTag, boolean multiple) throws org.wso2.andes.AMQException {
    isMessagesAcksProcessing = true;
    java.util.Collection<org.wso2.andes.server.queue.QueueEntry> ackedMessages = getAckedMessages(deliveryTag, multiple);
    _transaction.dequeue(ackedMessages, new org.wso2.andes.server.AMQChannel.MessageAcknowledgeAction(ackedMessages));
    for (org.wso2.andes.server.queue.QueueEntry entry : ackedMessages) {
        org.wso2.andes.amqp.QpidAndesBridge.ackReceived(this.getId(), entry.getMessage().getMessageNumber());
    }
    updateTransactionalActivity();
    isMessagesAcksProcessing = false;
}