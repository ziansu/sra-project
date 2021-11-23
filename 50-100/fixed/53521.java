@java.lang.Override
public void renewQueueLock(java.lang.String queueName, java.lang.String messageId, java.lang.String lockToken) throws com.microsoft.windowsazure.exception.ServiceException {
    com.sun.jersey.api.client.ClientResponse clientResponse = getResource().path(queueName).path("messages").path(messageId).path(lockToken).post(com.sun.jersey.api.client.ClientResponse.class, "0");
    com.microsoft.windowsazure.core.pipeline.PipelineHelpers.throwIfNotSuccess(clientResponse);
}