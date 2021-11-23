@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
@javax.ws.rs.Path(value = "/item/{token}")
public javax.ws.rs.core.Response viewItemById(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest req, @javax.ws.rs.PathParam(value = "token")
java.lang.String token) throws java.net.URISyntaxException {
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
    map.put("id", token);
    return javax.ws.rs.core.Response.ok(new org.glassfish.jersey.server.mvc.Viewable("/WEB-INF/jsp/publish/item/index.jsp", map)).build();
}