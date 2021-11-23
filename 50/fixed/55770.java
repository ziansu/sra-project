private void markMessageAsDelivered(java.lang.String oldId) {
    updateMessage(oldId, MonkeyItem.DeliveryStatus.delivered);
}