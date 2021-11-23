@jaxRs.GET
@jaxRs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String returnTitle() {
    jaxRs.User user = new jaxRs.User();
    user.setId(2);
    user.setName("Ola");
    return user.toString();
}