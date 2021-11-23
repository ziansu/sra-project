@server.rest.POST
@server.rest.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@server.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response createUser(db.models.User user, @javax.ws.rs.core.Context
javax.ws.rs.core.HttpHeaders headers) {
    if (accountService.addUser(user)) {
        return javax.ws.rs.core.Response.status(Response.Status.OK).entity(user.getLogin()).build();
    }else {
        return javax.ws.rs.core.Response.status(Response.Status.FORBIDDEN).build();
    }
}