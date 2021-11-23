@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_XML })
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_XML })
@com.cisco.blogger.service.JwtTokenNeeded
public javax.ws.rs.core.Response add(com.cisco.blogger.api.Blog blog) {
    if (((null == blog) || (null == (blog.getTitle()))) || (blog.getTitle().isEmpty())) {
        logger.info("Tittle is empty block");
        throw new com.cisco.blogger.api.BlogCreateException("Blog couldnot be created");
    }
    java.lang.String blogId = blogService.createBlog(blog);
    return javax.ws.rs.core.Response.ok().entity(blog).header("location", ("/blogger/blog/view/" + blogId)).build();
}