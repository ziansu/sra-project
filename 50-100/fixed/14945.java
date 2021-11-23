@com.server.GET
@com.server.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_XHTML_XML)
@com.server.Path(value = "/{id}/{postNum}/{userId}")
public javax.ws.rs.core.Response getPost(@com.server.PathParam(value = "id")
int id, @com.server.PathParam(value = "postNum")
int postNum, @com.server.PathParam(value = "userId")
int userId) {
    com.server.datatype.Event[] events = controller.getFirstPosts(id, userId, postNum);
    try {
        return javax.ws.rs.core.Response.ok(mapper.writeValueAsString(events)).build();
    } catch (java.lang.Exception e) {
    }
    return javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).build();
}