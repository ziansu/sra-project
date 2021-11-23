@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/username/{username}")
public javax.ws.rs.core.Response findUserByUsername(@javax.ws.rs.PathParam(value = "username")
final java.lang.String username) {
    final java.util.List<se.meer.jpa.model.User> user = service.findUserByFirstname(username);
    return javax.ws.rs.core.Response.ok().entity(user).build();
}