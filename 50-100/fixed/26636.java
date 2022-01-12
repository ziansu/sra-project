@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
@javax.ws.rs.Path(value = "/details")
public void clearDetailsProblems(@javax.ws.rs.QueryParam(value = "table")
java.lang.String tableID, @javax.ws.rs.QueryParam(value = "resource")
java.lang.String resource, @javax.ws.rs.QueryParam(value = "ptype")
java.lang.String ptype) {
    org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(org.apache.accumulo.monitor.Monitor.class);
    try {
        org.apache.accumulo.server.problems.ProblemReports.getInstance(org.apache.accumulo.monitor.Monitor.getContext()).deleteProblemReport(tableID, org.apache.accumulo.server.problems.ProblemType.valueOf(ptype), resource);
    } catch (java.lang.Exception e) {
        log.error(("Failed to delete problem reports for table " + tableID), e);
    }
}