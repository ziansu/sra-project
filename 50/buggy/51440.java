@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/detail/groups")
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
public java.util.Set<com.dp.blackhole.supervisor.model.ConsumerGroup> getAllConsumerGroupDetail(@javax.ws.rs.PathParam(value = "topic")
final java.lang.String topic) {
    com.dp.blackhole.rest.TopicResource.LOG.debug((("GET: topic[" + topic) + "] -> groups detail"));
    return supervisorService.getCopyOfConsumerGroups();
}