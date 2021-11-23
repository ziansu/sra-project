@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/one")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String returnDiagnose(@javax.ws.rs.QueryParam(value = "session")
java.lang.String session, @javax.ws.rs.QueryParam(value = "id")
java.lang.String id) {
    java.lang.String diagnose = "false";
    try {
        connector = eu.neq.mais.connector.ConnectorFactory.getConnector(eu.neq.mais.technicalservice.SessionStore.getBackendSid(session));
        diagnose = connector.returnDiagnose(session, id);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        diagnose = "false";
    }
    eu.neq.mais.request.DiagnoseHandler.logger.info(("return diagnose method returned json object: " + diagnose));
    return diagnose;
}