@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/update")
@javax.ws.rs.Consumes(value = "application/x-www-form-urlencoded")
public javax.ws.rs.core.Response updateUser(@javax.ws.rs.FormParam(value = "userid")
java.lang.String userId, @javax.ws.rs.FormParam(value = "username")
java.lang.String userName, @javax.ws.rs.FormParam(value = "password")
java.lang.String password, @javax.ws.rs.FormParam(value = "ini")
java.lang.String ini, @javax.ws.rs.FormParam(value = "role")
java.lang.String role, @javax.ws.rs.FormParam(value = "cpr")
java.lang.String cpr) throws java.net.URISyntaxException, webapplication.rest.DALException {
    java.util.List<java.lang.String> roles = new java.util.ArrayList<java.lang.String>();
    roles.add(role);
    webapplication.rest.OperatoerDTO user = new webapplication.rest.OperatoerDTO(java.lang.Integer.parseInt(userId), userName, ini, password);
    dao.updateOperatoer(user);
    java.net.URI location = new java.net.URI("../userpage.html");
    return javax.ws.rs.core.Response.temporaryRedirect(location).build();
}