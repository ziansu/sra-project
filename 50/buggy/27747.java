@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
public javax.ws.rs.core.Response createProject(@javax.ws.rs.core.Context
javax.ws.rs.core.UriInfo uriInfo, @javax.ws.rs.FormParam(value = "name")
java.lang.String name, @javax.ws.rs.FormParam(value = "username")
java.lang.String username, @javax.ws.rs.FormParam(value = "status")
java.lang.String status, @javax.ws.rs.FormParam(value = "description")
java.lang.String description, @javax.ws.rs.FormParam(value = "members")
java.lang.String members);