@javax.annotation.security.RolesAllowed(value = org.votingsystem.web.currency.util.AuthRole.ADMIN)
@org.votingsystem.web.currency.jaxrs.Path(value = "/weekdb/{year}/{month}/{day}")
@org.votingsystem.web.currency.jaxrs.GET
@org.votingsystem.web.currency.jaxrs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.Object weekdb(@org.votingsystem.web.currency.jaxrs.PathParam(value = "year")
int year, @org.votingsystem.web.currency.jaxrs.PathParam(value = "month")
int month, @org.votingsystem.web.currency.jaxrs.PathParam(value = "day")
int day, @javax.ws.rs.core.Context
javax.servlet.ServletContext context, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest req, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    java.util.Calendar calendar = org.votingsystem.web.currency.jaxrs.DateUtils.getCalendar(year, month, day);
    org.votingsystem.web.currency.jaxrs.Interval timePeriod = org.votingsystem.web.currency.jaxrs.DateUtils.getWeekPeriod(calendar);
    return new java.util.HashMap<>();
}