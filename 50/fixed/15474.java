@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/test")
public javax.ws.rs.core.Response getMsg() {
    java.lang.String output = "Jersey say : ";
    return javax.ws.rs.core.Response.status(200).entity(output).build();
}