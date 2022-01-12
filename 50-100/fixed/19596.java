@javax.annotation.security.RolesAllowed(value = org.votingsystem.web.currency.util.AuthRole.ADMIN)
@org.votingsystem.web.currency.jaxrs.Path(value = "/user/id/{userId}/db")
@org.votingsystem.web.currency.jaxrs.GET
@org.votingsystem.web.currency.jaxrs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.Map userDB(@org.votingsystem.web.currency.jaxrs.PathParam(value = "userId")
long userId) {
    org.votingsystem.model.User user = dao.find(org.votingsystem.model.User.class, userId);
    if (user == null) {
        throw new org.votingsystem.web.currency.jaxrs.NotFoundException(("userId: " + userId));
    }else
        return accountBean.getAccountsBalanceMap(user);
    
}