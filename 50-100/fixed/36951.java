public void checkCluster1HashIntSet(matching.eventProcessor.ClusterFamilyCheckerThread checker, long[] predicateVector) {
    long res;
    int[][] cluster = this.getSubscriptionsPredicates();
    res = predicateVector[cluster[0][0]];
    if (res != 0) {
        int r = this.getSubscriptionID(0);
        if (!(checker.subscriptionsMatched.contains(r))) {
            checker.subscriptionsMatched.add(r);
        }
    }
}