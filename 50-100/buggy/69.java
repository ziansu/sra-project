@com.CardiacArray.rest.POST
@com.CardiacArray.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public boolean createUser(com.CardiacArray.data.User user) {
    com.CardiacArray.data.User checkUser = getUserByEmail(user.getEmail());
    if (((checkUser.getFirstName()) == null) && ((checkUser.getLastName()) == null)) {
        userDb.createUser(user);
        return true;
    }else
        throw new com.CardiacArray.rest.BadRequestException();
    
}