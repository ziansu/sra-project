@org.jbei.ice.services.rest.GET
@org.jbei.ice.services.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@org.jbei.ice.services.rest.Path(value = "/{id}")
public org.jbei.ice.lib.account.AccountTransfer read(@javax.ws.rs.core.Context
final javax.ws.rs.core.UriInfo info, @org.jbei.ice.services.rest.PathParam(value = "id")
final java.lang.String userId) {
    org.jbei.ice.storage.model.Account account;
    if (userId.matches("\\d+(\\.\\d+)?")) {
        account = controller.get(java.lang.Long.decode(userId));
    }else {
        account = controller.getByEmail(userId);
    }
    if (account != null) {
        return account.toDataTransferObject();
    }
    return null;
}