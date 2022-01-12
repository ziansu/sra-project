public void onDeletedSubscription(java.lang.String subscriptionId) {
    org.opendaylight.yangpushserver.impl.YangpushProvider.LOG.info("Subscription with ID {} deleted. Deleting from related session", subscriptionId);
    for (org.opendaylight.netconf.impl.NetconfServerSession sessionKey : serverSessionToSubIds.keySet()) {
        java.util.Set<java.lang.String> toRemove = new java.util.HashSet<>();
        for (java.lang.String subIDValue : serverSessionToSubIds.get(sessionKey)) {
            if (subIDValue.equals(subscriptionId)) {
                toRemove.add(subscriptionId);
            }
        }
        serverSessionToSubIds.get(sessionKey).removeAll(toRemove);
    }
}