@java.lang.Override
public synchronized void removeSubscription(java.lang.String subscriptionId) throws org.n52.subverse.subscription.UnknownSubscriptionException {
    if (!(this.rules.containsKey(subscriptionId))) {
        throw new org.n52.subverse.subscription.UnknownSubscriptionException(("Subscription unknown: " + subscriptionId));
    }
    this.engine.unregisterRule(this.rules.get(subscriptionId));
    this.rules.remove(subscriptionId);
}