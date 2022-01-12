protected void afterExecute(java.lang.Runnable r, java.lang.Throwable t) {
    try {
        org.wso2.carbon.apimgt.gateway.throttling.publisher.DataProcessAndPublishingAgent agent = ((org.wso2.carbon.apimgt.gateway.throttling.publisher.DataProcessAndPublishingAgent) (r));
        agent.setDataReference(null);
        org.wso2.carbon.apimgt.gateway.throttling.publisher.ThrottleDataPublisher.dataPublisherPool.release(agent);
    } catch (java.lang.Exception e) {
        org.wso2.carbon.apimgt.gateway.throttling.publisher.ThrottleDataPublisher.log.error(("Error while returning Throttle data publishing agent back to pool" + (e.getMessage())));
    }
}