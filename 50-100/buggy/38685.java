@java.lang.SuppressWarnings(value = "UnusedDeclaration")
public org.wso2.carbon.event.core.topic.TopicRolePermission[] getTopicRolePermissions(java.lang.String topic) throws org.wso2.carbon.event.admin.internal.exception.EventAdminException {
    org.wso2.carbon.event.core.EventBroker eventBroker = org.wso2.carbon.event.admin.internal.util.EventAdminHolder.getInstance().getEventBroker();
    try {
        return eventBroker.getTopicManager().getTopicRolePermission(topic);
    } catch (org.wso2.carbon.event.core.exception.EventBrokerException e) {
        org.wso2.carbon.event.admin.internal.TopicManagerAdminService.log.error(e.getMessage(), e);
        throw new org.wso2.carbon.event.admin.internal.exception.EventAdminException("Error in accessing topic manager", e);
    }
}