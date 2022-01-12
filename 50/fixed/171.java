@rest.resources.POST
@rest.resources.Path(value = "/update/{userId}")
@rest.resources.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response updateUserById(@rest.resources.PathParam(value = "userId")
java.lang.Long id) {
    java.lang.String result = "Record updated: " + id;
    return javax.ws.rs.core.Response.status(201).entity(result).build();
}