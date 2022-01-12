@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{varX}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public jaxRs.User returnTitle() {
    jaxRs.User user = new jaxRs.User();
    user.setId(2);
    user.setName("Ola");
    return user;
}