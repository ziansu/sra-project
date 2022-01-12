public void onEstablishedSubscription(java.lang.String subscriptionId) {
    org.opendaylight.yangpushserver.impl.YangpushProvider.LOG.info("Subscription with ID {} established.", subscriptionId);
    if (latestEstablishedSubscriptionID.equals(priorEstablishedSubscriptionID)) {
        latestEstablishedSubscriptionID = subscriptionId;
    }else {
        priorEstablishedSubscriptionID = latestEstablishedSubscriptionID;
        latestEstablishedSubscriptionID = subscriptionId;
    }
}