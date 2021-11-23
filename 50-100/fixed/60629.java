@javax.ws.rs.POST
@javax.ws.rs.Produces(value = "application/x-www-form-urlencoded")
public javax.ws.rs.core.Response addItem(@javax.ws.rs.QueryParam(value = "sender")
java.lang.String sender, @javax.ws.rs.QueryParam(value = "receiver")
java.lang.String receiver, @javax.ws.rs.QueryParam(value = "subject")
java.lang.String subject, @javax.ws.rs.QueryParam(value = "message")
java.lang.String message) {
    backend.DatabaseConnector db = new backend.DatabaseConnector();
    java.util.Date date = new java.util.Date();
    java.util.Calendar c = java.util.Calendar.getInstance(java.util.Locale.UK);
    date = c.getTime();
    db.addItem(new backend.Item(sender, receiver, subject, date, message));
    return javax.ws.rs.core.Response.status(200).entity("email was successfully added!").build();
}