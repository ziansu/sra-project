@org.wikibrain.atlasify.GET
@org.wikibrain.atlasify.Path(value = "/helloworld")
@org.wikibrain.atlasify.Produces(value = "text/plain")
public javax.ws.rs.core.Response helloWorld() throws java.lang.Exception {
    return javax.ws.rs.core.Response.ok("hello world").build();
}