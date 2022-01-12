@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{publicCId}/{userEmail}")
public javax.ws.rs.core.Response getUser(@javax.ws.rs.PathParam(value = "publicCId")
java.lang.String publicCId, @javax.ws.rs.PathParam(value = "userEmail")
java.lang.String userEmail) throws io.hops.site.rest.exception.AppException {
    java.util.Optional<io.hops.site.dao.entity.Users> user = usersController.findUserByEmailAndClusterId(userEmail, publicCId);
    if (user.isPresent()) {
        return javax.ws.rs.core.Response.ok(new io.hops.site.dto.UserDTO.Retrieve(user.get())).build();
    }else {
        throw new io.hops.site.rest.exception.AppException(Response.Status.EXPECTATION_FAILED.getStatusCode(), "user not found");
    }
}