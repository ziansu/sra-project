@auth.AuthenticationEndpoint.Secured(value = config.Permission.USER_READ)
@module.POST
@module.Path(value = config.Routes.MODULE_USER_GETUSER)
@module.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public dto.User getUser(@module.PathParam(value = config.Routes.MODULE_USER_GETUSER)
int id) {
    jdbclib.IConnector db = null;
    dto.User user = null;
    try {
        db = new jdbclib.DBConnector(new jdbclib.DatabaseConnection());
        dao.UserDAO userDAO = new dao.UserDAO(db);
        user = userDAO.getFullUser(id);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("Error: " + (e.getMessage())));
        javax.ws.rs.core.Response.temporaryRedirect(java.net.URI.create("/auth/user/error"));
    }
    return user;
}