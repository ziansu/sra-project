public void setBackLogWeightPolicy(java.lang.String policy) {
    if (!(DEFAULT_BACKLOG_WEIGHT_POLICY.equals(policy))) {
        this.policy = policy;
        this._backlogWeightPolicy = com.gigaspaces.internal.cluster.node.impl.backlog.BacklogWeightPolicyFactory.create(policy);
    }
}