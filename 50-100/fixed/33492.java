@java.lang.SuppressWarnings(value = "UnusedDeclaration")
public org.wso2.carbon.event.admin.internal.Subscription[] getJMSSubscriptionsForTopic(java.lang.String topic) throws org.wso2.carbon.event.admin.internal.exception.EventAdminException {
    org.wso2.carbon.event.core.EventBroker eventBroker = org.wso2.carbon.event.admin.internal.util.EventAdminHolder.getInstance().getEventBroker();
    try {
        return adaptSubscriptions(eventBroker.getTopicManager().getJMSSubscriptions(topic));
    } catch (org.wso2.carbon.event.core.exception.EventBrokerException e) {
        org.wso2.carbon.event.admin.internal.TopicManagerAdminService.log.error("Cannot get the jms subscriptions", e);
        throw new org.wso2.carbon.event.admin.internal.exception.EventAdminException("Cannot get the jms subscriptions", e);
    }
}