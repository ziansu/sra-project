@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/all/{timestamp}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String getModified(@javax.ws.rs.PathParam(value = "timestamp")
int timestamp) {
    return getModified(timestamp, null);
}