public java.util.List<java.lang.Object[]> getSubscriptionIdsForOrg(org.oscm.subscriptionservice.dao.PlatformUser user, java.util.Set<org.oscm.internal.types.enumtypes.SubscriptionStatus> states, long vendorKey) {
    java.lang.String queryString = getQuerySubscriptionIdsForOrg();
    return getSubscriptionIdsForVendor(user, states, queryString, vendorKey);
}