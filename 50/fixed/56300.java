public java.util.List<? extends java.lang.Object> execute(org.flowable.engine.impl.interceptor.CommandContext commandContext) {
    org.flowable.engine.impl.EventSubscriptionQueryImpl query = new org.flowable.engine.impl.EventSubscriptionQueryImpl(commandContext);
    return commandContext.getEventSubscriptionEntityManager().findEventSubscriptionsByQueryCriteria(query);
}