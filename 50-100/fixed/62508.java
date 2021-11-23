@javax.annotation.security.RolesAllowed(value = org.votingsystem.web.currency.util.AuthRole.ADMIN)
@org.votingsystem.web.currency.jaxrs.GET
@org.votingsystem.web.currency.jaxrs.Path(value = "/user/id/{userId}")
public javax.ws.rs.core.Response user(@org.votingsystem.web.currency.jaxrs.PathParam(value = "userId")
long userId) throws java.lang.Exception {
    org.votingsystem.web.util.MessagesVS messages = org.votingsystem.web.util.MessagesVS.getCurrentInstance();
    org.votingsystem.model.User user = dao.find(org.votingsystem.model.User.class, userId);
    if (user == null)
        return javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).entity(messages.get("objectNotFoundMsg", userId)).build();
    
    return getUserBalancesDto(user, org.votingsystem.web.currency.jaxrs.DateUtils.getWeekPeriod(java.util.Calendar.getInstance()));
}