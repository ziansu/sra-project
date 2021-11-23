@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/asks")
public javax.ws.rs.core.Response fetchAsks() {
    java.util.List<com.outcomehub.qwanda.Ask> entitys = service.getAsks();
    return javax.ws.rs.core.Response.status(200).entity(entitys).build();
}