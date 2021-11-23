@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/add")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = (javax.ws.rs.core.MediaType.APPLICATION_JSON) + ";charset=UTF-8")
public javax.ws.rs.core.Response getPathAccidents(rs.opendata.app.domain.ReportedAccident ra) {
    rs.opendata.app.statistics.ReportedAccidentStatistics ras = raService.getGlobalStatus();
    raService.saveReportedAccident(ra);
    java.lang.String json = rs.opendata.app.rest.parsers.ReportedAccidentJsonParser.serializeGlobalStatus(ras).toString();
    return javax.ws.rs.core.Response.status(Status.OK).entity(json).build();
}