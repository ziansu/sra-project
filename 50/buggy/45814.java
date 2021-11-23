@javax.ws.rs.GET
@javax.ws.rs.Produces(value = "text/plain")
public javax.ws.rs.core.Response doGet() {
    return javax.ws.rs.core.Response.ok(java.util.Arrays.asList("iPad", "iPod", "iPhone")).build();
}