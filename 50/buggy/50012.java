@io.swagger.annotations.ApiOperation(value = "Delete a patient")
@org.springframework.web.bind.annotation.RequestMapping(value = "/{patientId}/delete", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void deletePatient(@org.springframework.web.bind.annotation.PathVariable(value = "patientId")
java.lang.Long patientId) throws com.fasterxml.jackson.core.JsonProcessingException, java.sql.SQLException {
    patientManager.delete(patientId);
    auditManager.createPulseAuditEvent(AuditType.PD, patientId);
}