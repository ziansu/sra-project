@com.critters.ajax.DELETE
@com.critters.ajax.Path(value = "/deleteUser")
@com.critters.ajax.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response deleteUserAccount(javax.xml.bind.JAXBElement<com.critters.dal.dto.entity.User> jsonUser) throws java.io.IOException, java.security.GeneralSecurityException, javax.resource.spi.InvalidPropertyException, javax.xml.bind.JAXBException {
    com.critters.dal.dto.entity.User user = jsonUser.getValue();
    com.critters.dal.dto.entity.User loggedInUser = ((com.critters.dal.dto.entity.User) (httpRequest.getSession().getAttribute("user")));
    if (loggedInUser == null) {
        return javax.ws.rs.core.Response.status(Response.Status.UNAUTHORIZED).entity("You need to log in first!").build();
    }else {
        com.critters.bll.UserBLL.deleteUser(loggedInUser);
    }
    return null;
}