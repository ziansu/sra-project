@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/primary/hotfiles")
public javax.ws.rs.core.Response hotFiles() {
    org.smartdata.server.rest.List<org.smartdata.metastore.tables.AccessCountTable> tables = ssm.getStatesManager().getTablesInLast(Constants.ONE_HOUR_IN_MILLIS);
    return new org.smartdata.server.rest.message.JsonResponse(Response.Status.OK, ssm.getStatesManager().getHotFiles(tables, 20)).build();
}