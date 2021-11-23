@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/users")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_XML)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public com.epam.entities.User createUser(com.epam.entities.User user) {
    userDao.addUser(user);
    return new com.epam.entities.User();
}