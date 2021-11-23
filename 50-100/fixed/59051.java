public com.js.agtools.domain.SubscriptionPackages fetchSubscriptionsForUserType(int userType) throws com.js.agtools.exception.AgtoolDaoException {
    com.js.agtools.domain.SubscriptionPackages subscriptionPackages = new com.js.agtools.domain.SubscriptionPackages();
    subscriptionPackages.setCommodities(widgetService.fetchCommodities());
    subscriptionPackages.setSubUserType(subscriptionDao.fetchSubUsertypeForUserType(userType));
    subscriptionPackages.setNewPackages(fetchPackages(0));
    return subscriptionPackages;
}