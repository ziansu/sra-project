@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/sendtophone")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response sendEmailToPhone(com.au.personal.safety.email.EmailMessage emailMessage) {
    com.au.personal.safety.email.Email email = new com.au.personal.safety.email.Email(emailMessage);
    email.sendMessage();
    return javax.ws.rs.core.Response.status(Response.Status.OK).entity("Success!").build();
}