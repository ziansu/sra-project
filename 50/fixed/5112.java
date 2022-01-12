@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/create")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_XML)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public com.epam.entities.User createUser(com.epam.entities.User user) {
    userDao.addUser(user);
    return user;
}