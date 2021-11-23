private int getMajorityPolicy(java.util.Map<java.lang.Integer, java.lang.Integer> countsMap) {
    int majorityCount = 0;
    int majorityPolicy = 0;
    for (int policy : countsMap.keySet()) {
        if ((countsMap.get(policy)) > majorityCount) {
            majorityPolicy = policy;
            majorityCount = countsMap.get(policy);
        }
    }
    return majorityPolicy;
}