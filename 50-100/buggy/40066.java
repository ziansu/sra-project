@javax.annotation.security.RolesAllowed(value = org.votingsystem.web.currency.util.AuthRole.ADMIN)
@org.votingsystem.web.currency.jaxrs.Path(value = "/user/id/{userId}/{year}/{month}")
@org.votingsystem.web.currency.jaxrs.GET
@org.votingsystem.web.currency.jaxrs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response userMonth(@org.votingsystem.web.currency.jaxrs.PathParam(value = "userId")
long userId, @org.votingsystem.web.currency.jaxrs.PathParam(value = "year")
int year, @org.votingsystem.web.currency.jaxrs.PathParam(value = "month")
int month, @javax.ws.rs.core.Context
javax.servlet.ServletContext context, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest req, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletResponse resp) throws java.lang.Exception {
    java.util.Calendar calendar = org.votingsystem.web.currency.jaxrs.DateUtils.getCalendar(year, month, 1);
    org.votingsystem.model.User user = dao.find(org.votingsystem.model.User.class, userId);
    if (user == null)
        return javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).entity(("ERROR - User not found - userId: " + userId)).build();
    
    return getUserBalancesDto(req, resp, context, user, org.votingsystem.web.currency.jaxrs.DateUtils.getMonthPeriod(calendar));
}