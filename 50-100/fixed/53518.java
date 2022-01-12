public int decrementNumberOfScheduledDeliveries(long messageID) {
    org.wso2.andes.kernel.OnflightMessageTracker.MsgData trackingData = getTrackingData(messageID);
    int count = 0;
    if (trackingData != null) {
        count = trackingData.numberOfScheduledDeliveries.decrementAndGet();
        if (count == 0) {
            trackingData.addMessageStatus(MessageStatus.SENT_TO_ALL);
        }
        if (org.wso2.andes.kernel.OnflightMessageTracker.log.isDebugEnabled()) {
            org.wso2.andes.kernel.OnflightMessageTracker.log.debug(((("message id= " + messageID) + " sent. Pending to execute= ") + count));
        }
    }
    return count;
}