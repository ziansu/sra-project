@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{parameter}/login")
public javax.ws.rs.core.Response loginUser(@javax.ws.rs.PathParam(value = "parameter")
int parameter, @javax.ws.rs.DefaultValue(value = "Login Succesful")
@javax.ws.rs.QueryParam(value = "value")
java.lang.String value) {
    int userId = parameter;
    java.lang.String sessionId = getSessionId(userId, context);
    java.lang.String output = "";
    if (sessionId != null) {
        output = sessionId;
    }
    return javax.ws.rs.core.Response.status(200).entity(output).build();
}