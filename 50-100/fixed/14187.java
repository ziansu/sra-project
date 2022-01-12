@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "{id}")
public javax.ws.rs.core.Response deleteSchema(@javax.ws.rs.PathParam(value = "id")
long schemaId) {
    try {
        schemaService.deleteSchema(schemaId);
    } catch (org.unidal.dal.jdbc.DalNotFoundException e) {
        throw new com.ctrip.hermes.meta.server.RestException(("Schema not found: " + schemaId), javax.ws.rs.core.Response.Status.NOT_FOUND);
    } catch (org.unidal.dal.jdbc.DalException e) {
        throw new com.ctrip.hermes.meta.server.RestException(e, javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR);
    }
    return javax.ws.rs.core.Response.status(Status.OK).build();
}