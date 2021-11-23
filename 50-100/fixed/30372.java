@java.lang.Override
public void renewSubscriptionLock(java.lang.String topicName, java.lang.String subscriptionName, java.lang.String messageId, java.lang.String lockToken) throws com.microsoft.windowsazure.exception.ServiceException {
    com.sun.jersey.api.client.ClientResponse clientResponse = getResource().path(topicName).path("Subscriptions").path(subscriptionName).path("messages").path(messageId).path(lockToken).post(com.sun.jersey.api.client.ClientResponse.class, "0");
    com.microsoft.windowsazure.core.pipeline.PipelineHelpers.throwIfNotSuccess(clientResponse);
}