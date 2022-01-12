private void onSubscriptionAlreadyClosed(org.wso2.andes.kernel.DeliverableAndesMetadata message, org.wso2.andes.subscription.LocalSubscription subscription) throws org.wso2.andes.kernel.AndesException {
    message.markDeliveredChannelAsClosed(subscription.getChannelID());
    if (subscription.isDurable()) {
        message.evaluateMessageAcknowledgement();
        if (message.isAknowledgedByAll()) {
            java.util.List<org.wso2.andes.kernel.DeliverableAndesMetadata> messageToDelete = new java.util.ArrayList<>();
            messageToDelete.add(message);
            org.wso2.andes.kernel.MessagingEngine.getInstance().deleteMessages(messageToDelete);
        }
    }
}