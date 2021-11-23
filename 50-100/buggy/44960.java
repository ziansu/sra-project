public void closeConnection(java.util.UUID channelID, java.lang.String nodeID) throws org.wso2.andes.kernel.subscription.SubscriptionException {
    if (this.isActive) {
        this.subscriberConnection = null;
        this.isActive = false;
    }else {
        throw new org.wso2.andes.kernel.subscription.SubscriptionException(((("Cannot close inactive subscription id= " + (getSubscriptionId())) + " channelID= ") + channelID));
    }
}