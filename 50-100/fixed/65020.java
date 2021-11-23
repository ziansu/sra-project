@sm.azure.sb.rest.POST
@sm.azure.sb.rest.Path(value = "/messages/{value}")
@sm.azure.sb.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response sendMessage(@sm.azure.sb.rest.PathParam(value = "value")
java.lang.Integer value) {
    try {
        sm.azure.sb.bus.BusProducer producer = sm.azure.sb.bus.BusProducer.getInstance();
        producer.sendMessage(value);
        return javax.ws.rs.core.Response.status(Response.Status.OK).build();
    } catch (java.lang.Exception e) {
        sm.azure.sb.rest.RestApi.logger.error(e.getMessage());
        return javax.ws.rs.core.Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
    }
}