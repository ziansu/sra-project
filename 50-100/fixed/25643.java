@java.lang.SuppressWarnings(value = "UnusedDeclaration")
public org.wso2.carbon.event.admin.internal.Subscription[] getWsSubscriptionsForTopic(java.lang.String topic) throws org.wso2.carbon.event.admin.internal.exception.EventAdminException {
    org.wso2.carbon.event.core.EventBroker eventBroker = org.wso2.carbon.event.admin.internal.util.EventAdminHolder.getInstance().getEventBroker();
    try {
        return adaptSubscriptions(eventBroker.getTopicManager().getSubscriptions(topic, true));
    } catch (org.wso2.carbon.event.core.exception.EventBrokerException e) {
        org.wso2.carbon.event.admin.internal.TopicManagerAdminService.log.error("Error in accessing topic manager", e);
        throw new org.wso2.carbon.event.admin.internal.exception.EventAdminException("Error in accessing topic manager", e);
    }
}