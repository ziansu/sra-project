private javax.ws.rs.core.Response getUserBalancesDto(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, javax.servlet.ServletContext context, org.votingsystem.model.User user, org.votingsystem.web.currency.jaxrs.Interval timePeriod) throws java.lang.Exception {
    org.votingsystem.dto.currency.BalancesDto balancesDto = balancesBean.getBalancesDto(user, timePeriod);
    return javax.ws.rs.core.Response.ok().type(MediaType.JSON).entity(org.votingsystem.web.currency.jaxrs.JSON.getMapper().writeValueAsBytes(balancesDto)).build();
}