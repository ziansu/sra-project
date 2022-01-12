public int incrementNumberOfScheduledDeliveries(long messageID) {
    org.wso2.andes.kernel.OnflightMessageTracker.MsgData trackingData = getTrackingData(messageID);
    trackingData.addMessageStatus(MessageStatus.SCHEDULED_TO_SEND);
    int numOfSchedules = trackingData.numberOfScheduledDeliveries.incrementAndGet();
    if (org.wso2.andes.kernel.OnflightMessageTracker.log.isDebugEnabled()) {
        org.wso2.andes.kernel.OnflightMessageTracker.log.debug(((("message id= " + messageID) + " scheduled. Pending to execute= ") + numOfSchedules));
    }
    return numOfSchedules;
}