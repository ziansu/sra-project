public synchronized void deleteAllLocalSubscriptionsOfBoundQueue(java.lang.String boundQueueName) throws org.wso2.andes.kernel.AndesException {
    java.util.Set<org.wso2.andes.kernel.LocalSubscription> subscriptionsOfQueue = subscriptionStore.getListOfLocalSubscriptionsBoundToQueue(boundQueueName);
    for (org.wso2.andes.kernel.LocalSubscription subscription : subscriptionsOfQueue) {
        try {
            subscriptionStore.createDisconnectOrRemoveLocalSubscription(subscription, SubscriptionListener.SubscriptionChange.DELETED);
        } catch (org.wso2.andes.kernel.SubscriptionAlreadyExistsException ignore) {
        }
        notifyLocalSubscriptionHasChanged(subscription, SubscriptionListener.SubscriptionChange.DELETED);
    }
}