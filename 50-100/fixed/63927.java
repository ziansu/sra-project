@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "put")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_OCTET_STREAM)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response put(java.io.InputStream body, @javax.ws.rs.QueryParam(value = "sessionId")
java.lang.String sessionId, @javax.ws.rs.QueryParam(value = "name")
java.lang.String name, @javax.ws.rs.QueryParam(value = "datafileFormatId")
java.lang.String datafileFormatId, @javax.ws.rs.QueryParam(value = "datasetId")
java.lang.String datasetId, @javax.ws.rs.QueryParam(value = "description")
java.lang.String description, @javax.ws.rs.QueryParam(value = "doi")
java.lang.String doi, @javax.ws.rs.QueryParam(value = "datafileCreateTime")
java.lang.String datafileCreateTime, @javax.ws.rs.QueryParam(value = "datafileModTime")
java.lang.String datafileModTime) throws org.icatproject.ids.exceptions.BadRequestException, org.icatproject.ids.exceptions.DataNotOnlineException, org.icatproject.ids.exceptions.InsufficientPrivilegesException, org.icatproject.ids.exceptions.InternalException, org.icatproject.ids.exceptions.NotFoundException, org.icatproject.ids.exceptions.NotImplementedException {
    return idsBean.put(body, sessionId, name, datafileFormatId, datasetId, description, doi, datafileCreateTime, datafileModTime, false, false);
}