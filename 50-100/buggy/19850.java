@java.lang.Override
public boolean evaluate(org.wso2.andes.server.queue.QueueEntry message) throws org.wso2.andes.kernel.AndesException {
    long messageID = message.getMessage().getMessageNumber();
    org.wso2.andes.kernel.ProtocolMessage protocolMessage = ((org.wso2.andes.server.message.AMQMessage) (message.getMessage())).getAndesMetadataReference();
    int numOfDeliveriesOfCurrentMsg = protocolMessage.getNumberOfDeliveriesForProtocolChannel();
    if (numOfDeliveriesOfCurrentMsg > (maximumRedeliveryTimes)) {
        org.wso2.andes.kernel.MaximumNumOfDeliveryRuleAMQP.log.warn(("Number of Maximum Redelivery Tries Has Breached. Routing Message to DLC : id= " + messageID));
        return false;
    }else {
        return true;
    }
}