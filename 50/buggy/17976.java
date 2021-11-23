public org.activiti.engine.impl.EventSubscriptionQueryImpl eventSubscriptionId(java.lang.String id) {
    if ((eventSubscriptionId) == null) {
        throw new org.activiti.engine.ActivitiIllegalArgumentException("Provided event subscription id is null");
    }
    this.eventSubscriptionId = id;
    return this;
}