@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/{id}")
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
public javax.ws.rs.core.Response rollbackTransaction(@javax.ws.rs.PathParam(value = "id")
final long id, @javax.ws.rs.core.Context
javax.ws.rs.core.UriInfo uriInfo) {
    final org.neo4j.server.rest.transactional.TransactionHandle transactionHandle;
    try {
        transactionHandle = facade.findTransactionHandle(id);
    } catch (org.neo4j.server.rest.transactional.error.TransactionLifecycleException e) {
        return invalidTransaction(e, uriInfo.getBaseUri());
    }
    return okResponse(rollback(transactionHandle, uriInfo.getBaseUri()));
}