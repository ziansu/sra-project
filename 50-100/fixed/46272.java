public boolean isMarkAsAcked() {
    boolean isAcked = true;
    for (java.util.Map.Entry<java.util.UUID, org.wso2.andes.kernel.DeliverableAndesMetadata.ChannelInformation> channelInfoEntry : channelDeliveryInfo.entrySet()) {
        org.wso2.andes.kernel.ChannelMessageStatus messageStatus = channelInfoEntry.getValue().getLatestMessageStatus();
        if ((null == messageStatus) || (!(messageStatus.equals(ChannelMessageStatus.ACKED)))) {
            isAcked = false;
            break;
        }
    }
    if (channelDeliveryInfo.entrySet().isEmpty()) {
        isAcked = false;
    }
    return isAcked;
}