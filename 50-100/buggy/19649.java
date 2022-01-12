@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/comments/count")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response getCount(@javax.ws.rs.PathParam(value = "blogid")
int blogid) {
    try {
        com.cisco.cmad.blogs.rest.var count = com.cisco.cmad.blogs.rest.CommentsController.commentService.readCountByBlogId(blogid);
        return javax.ws.rs.core.Response.ok().entity(count).build();
    } catch (com.cisco.cmad.blogs.api.DataNotFoundException dnfe) {
        return javax.ws.rs.core.Response.status(Response.Status.NO_CONTENT).build();
    } catch (com.cisco.cmad.blogs.api.BlogException be) {
        return javax.ws.rs.core.Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
    }
}