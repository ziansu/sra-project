@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/deleteBatch/{division}/{batch}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response deleteBatch(@javax.ws.rs.PathParam(value = "division")
java.lang.Integer div_id, @javax.ws.rs.PathParam(value = "batch")
java.lang.Integer batch_id) {
    com.transaction.batch.BatchTransactions batchTransactions = new com.transaction.batch.BatchTransactions();
    batchTransactions.deleteBatch(getRegId(), div_id, batch_id);
    return javax.ws.rs.core.Response.status(Response.Status.OK).build();
}