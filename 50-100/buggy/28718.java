@javax.annotation.security.RolesAllowed(value = org.votingsystem.web.currency.util.AuthRole.USER)
@org.votingsystem.web.currency.jaxrs.Path(value = "/user/{year}/{month}")
@org.votingsystem.web.currency.jaxrs.GET
@org.votingsystem.web.currency.jaxrs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response authUserMonth(@org.votingsystem.web.currency.jaxrs.PathParam(value = "year")
int year, @org.votingsystem.web.currency.jaxrs.PathParam(value = "month")
int month, @javax.ws.rs.core.Context
javax.servlet.ServletContext context, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest req, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletResponse resp) throws java.lang.Exception {
    java.util.Calendar calendar = org.votingsystem.web.currency.jaxrs.DateUtils.getCalendar(year, month, 1);
    org.votingsystem.model.User user = ((org.votingsystem.web.currency.util.PrincipalVS) (req.getUserPrincipal())).getUser();
    return getUserBalancesDto(req, resp, context, user, org.votingsystem.web.currency.jaxrs.DateUtils.getMonthPeriod(calendar));
}