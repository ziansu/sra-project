@edu.hm.lipptobusch.shareit.resource.GET
@edu.hm.lipptobusch.shareit.resource.Path(value = "books")
@edu.hm.lipptobusch.shareit.resource.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response getBooks(@edu.hm.lipptobusch.shareit.resource.QueryParam(value = "token")
java.lang.String token) {
    java.lang.String test = callOAuthServer(token);
    if (test.isEmpty()) {
        return javax.ws.rs.core.Response.status(MediaServiceResult.TOKEN_NOT_VALID.getStatusCode()).entity(MediaServiceResult.TOKEN_NOT_VALID).build();
    }
    edu.hm.lipptobusch.shareit.models.Medium[] allBooks = edu.hm.lipptobusch.shareit.resource.MediaResource.mediaService.getBooks();
    return javax.ws.rs.core.Response.status(Response.Status.OK).entity(allBooks).build();
}