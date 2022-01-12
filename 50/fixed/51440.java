@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/detail/groups")
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
public java.util.Set<com.dp.blackhole.supervisor.model.ConsumerGroup> getAllConsumerGroupDetail() {
    return supervisorService.getCopyOfConsumerGroups();
}