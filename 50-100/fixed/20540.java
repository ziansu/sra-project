@java.lang.Override
public boolean evaluate(org.wso2.andes.server.queue.QueueEntry message) throws org.wso2.andes.kernel.AndesException {
    long messageID = message.getMessage().getMessageNumber();
    java.lang.Integer numOfDeliveriesOfCurrentMsg = message.getAndesMessageReference().getTrackingData().getNumOfDeliveires4Channel(amqChannelID);
    if (numOfDeliveriesOfCurrentMsg > ((maximumRedeliveryTimes) + 1)) {
        org.wso2.andes.kernel.MaximumNumOfDeliveryRule.log.warn(("Number of Maximum Redelivery Tries Has Breached. Routing Message to DLC : id= " + messageID));
        return false;
    }else {
        return true;
    }
}