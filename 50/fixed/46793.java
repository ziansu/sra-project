@java.lang.Override
public java.util.List<org.oscm.subscriptionservice.dao.Subscription> call() throws java.lang.Exception {
    return dao.getSubscriptionsForUserWithSubscriptionKeys(user, mock(org.oscm.internal.tables.Pagination.class), keys);
}