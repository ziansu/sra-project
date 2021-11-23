@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/modif/{timestamp}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String getModified(@javax.ws.rs.PathParam(value = "timestamp")
long timestamp) {
    return getModified(timestamp, null);
}