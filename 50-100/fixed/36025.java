@javax.annotation.security.RolesAllowed(value = org.votingsystem.web.currency.util.AuthRole.USER)
@org.votingsystem.web.currency.jaxrs.Path(value = "/user/{year}")
@org.votingsystem.web.currency.jaxrs.GET
@org.votingsystem.web.currency.jaxrs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response authUserYear(@org.votingsystem.web.currency.jaxrs.PathParam(value = "year")
int year, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest req) throws java.lang.Exception {
    java.util.Calendar calendar = org.votingsystem.web.currency.jaxrs.DateUtils.getCalendar(year, 1, 1);
    org.votingsystem.model.User user = ((org.votingsystem.web.currency.util.PrincipalVS) (req.getUserPrincipal())).getUser();
    return getUserBalancesDto(user, org.votingsystem.web.currency.jaxrs.DateUtils.getYearPeriod(calendar));
}