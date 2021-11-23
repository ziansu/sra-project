@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
@javax.ws.rs.Path(value = "/summary")
public void clearTableProblems(@javax.ws.rs.QueryParam(value = "s")
java.lang.String tableID) {
    org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(org.apache.accumulo.monitor.Monitor.class);
    try {
        org.apache.accumulo.server.problems.ProblemReports.getInstance(org.apache.accumulo.monitor.Monitor.getContext()).deleteProblemReports(tableID);
    } catch (java.lang.Exception e) {
        log.error(("Failed to delete problem reports for table " + tableID), e);
    }
}