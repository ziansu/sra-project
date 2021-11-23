@org.jbei.ice.services.rest.GET
@org.jbei.ice.services.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response get(@org.jbei.ice.services.rest.DefaultValue(value = "0")
@org.jbei.ice.services.rest.QueryParam(value = "offset")
final int offset, @org.jbei.ice.services.rest.DefaultValue(value = "15")
@org.jbei.ice.services.rest.QueryParam(value = "limit")
final int limit, @org.jbei.ice.services.rest.DefaultValue(value = "lastName")
@org.jbei.ice.services.rest.QueryParam(value = "sort")
final java.lang.String sort, @org.jbei.ice.services.rest.DefaultValue(value = "true")
@org.jbei.ice.services.rest.QueryParam(value = "asc")
final boolean asc, @org.jbei.ice.services.rest.QueryParam(value = "filter")
java.lang.String filter) {
    final java.lang.String userId = getUserId();
    log(userId, "retrieving available accounts");
    try {
        org.jbei.ice.lib.account.Accounts accounts = new org.jbei.ice.lib.account.Accounts();
        org.jbei.ice.lib.dto.AccountResults result = accounts.getAvailableAccounts(userId, offset, limit, asc, sort, filter);
        return super.respond(result);
    } catch (org.jbei.ice.lib.access.PermissionException pe) {
        return super.respond(Response.Status.UNAUTHORIZED);
    }
}