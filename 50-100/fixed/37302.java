@javax.ws.rs.Path(value = "exists")
@javax.ws.rs.POST
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
public java.lang.Boolean isUser(@javax.ws.rs.FormParam(value = "id")
java.lang.String id, @javax.ws.rs.FormParam(value = "email")
java.lang.String email) {
    if (!(id == null)) {
        return !(getUser(id).equals(null));
    }else {
        return !((restRequest.SQLConnection.getIduserFromEmail(email)) == null);
    }
}