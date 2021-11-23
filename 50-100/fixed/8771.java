@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/all")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String returnDiagnose(@javax.ws.rs.QueryParam(value = "session")
java.lang.String session, @javax.ws.rs.QueryParam(value = "patientId")
java.lang.String patientId) {
    java.lang.String medications = "false";
    try {
        connector = eu.neq.mais.connector.ConnectorFactory.getConnector(eu.neq.mais.technicalservice.SessionStore.getBackendSid(session));
        medications = connector.returnMedicationsForPatient(patientId);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        medications = "false";
    }
    eu.neq.mais.request.MedicationHandler.logger.info(("return medication method returned json object: " + medications));
    return medications;
}