public void setBackLogWeightPolicy(java.lang.String policy) {
    if (!(policy.equals(DEFAULT_BACKLOG_WEIGHT_POLICY))) {
        this.policy = policy;
        this._backlogWeightPolicy = com.gigaspaces.internal.cluster.node.impl.backlog.BacklogWeightPolicyFactory.create(policy);
    }
}