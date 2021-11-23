@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/id/{publicCId}/{userEmail}")
public javax.ws.rs.core.Response getUserId(@javax.ws.rs.PathParam(value = "publicCId")
java.lang.String publicCId, @javax.ws.rs.PathParam(value = "userEmail")
java.lang.String userEmail) throws io.hops.site.rest.exception.AppException {
    java.util.Optional<io.hops.site.dao.entity.Users> user = usersController.findUserByEmailAndClusterId(userEmail, publicCId);
    if (!(user.isPresent())) {
        return javax.ws.rs.core.Response.ok(user.get().getId()).build();
    }else {
        throw new io.hops.site.rest.exception.AppException(Response.Status.EXPECTATION_FAILED.getStatusCode(), "user not found");
    }
}