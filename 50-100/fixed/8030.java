public net.anyflow.lannister.message.OutboundMessageStatus setOutboundMessageStatus(int messageId, net.anyflow.lannister.message.OutboundMessageStatus.Status targetStatus) {
    net.anyflow.lannister.message.OutboundMessageStatus status = outboundMessageStatuses.get(messageId);
    if (status == null) {
        return null;
    }
    status.targetStatus(targetStatus);
    return outboundMessageStatuses.put(status.messageId(), status);
}