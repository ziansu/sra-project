@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/data")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response putData() {
    try {
        sm.azure.sb.bus.BusProducer producer = sm.azure.sb.bus.BusProducer.getInstance();
        producer.sendMessage();
        return javax.ws.rs.core.Response.status(Response.Status.OK).build();
    } catch (java.lang.Exception e) {
        sm.azure.sb.rest.RestApi.logger.error(e.getMessage());
        return javax.ws.rs.core.Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
    }
}