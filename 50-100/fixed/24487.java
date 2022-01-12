@javax.ws.rs.GET
@javax.ws.rs.Path(value = "{topic}")
public java.util.List<com.ctrip.hermes.core.bo.ConsumerView> getConsumers(@javax.ws.rs.PathParam(value = "topic")
java.lang.String topic) {
    com.ctrip.hermes.portal.resource.ConsumerResource.logger.debug("Get consumers of topic: {}", topic);
    java.util.List<com.ctrip.hermes.core.bo.ConsumerView> returnResult = new java.util.ArrayList<com.ctrip.hermes.core.bo.ConsumerView>();
    try {
        java.util.List<com.ctrip.hermes.meta.entity.ConsumerGroup> consumers = consumerService.getConsumers(topic);
        for (com.ctrip.hermes.meta.entity.ConsumerGroup c : consumers) {
            returnResult.add(new com.ctrip.hermes.core.bo.ConsumerView(topic, c));
        }
    } catch (java.lang.Exception e) {
        throw new com.ctrip.hermes.portal.resource.assists.RestException(e, javax.ws.rs.core.Response.Status.NOT_FOUND);
    }
    return returnResult;
}