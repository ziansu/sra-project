@no.ntnu.stud.minvakt.services.DELETE
@no.ntnu.stud.minvakt.services.Path(value = "/deleteuser/{userId}")
@no.ntnu.stud.minvakt.services.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.Boolean deleteUser(@no.ntnu.stud.minvakt.services.PathParam(value = "userId")
int userId) {
    no.ntnu.stud.minvakt.data.Session session = getSession();
    if (!(session.isAdmin())) {
        throw new no.ntnu.stud.minvakt.services.NotAuthorizedException("Cannot access service", Response.Status.UNAUTHORIZED);
    }
    boolean isDeleted = userDBManager.deleteUser(userId);
    if (!isDeleted)
        log.log(java.util.logging.Level.WARNING, ("Failed to delete user: " + userId));
    
    return isDeleted;
}