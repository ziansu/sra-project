@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/createPatient")
public java.lang.String createPatient(java.lang.String jsonData) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    try {
        com.kms.cura.entity.user.PatientUserEntity entity = com.kms.cura.entity.json.JsonToEntityConverter.convertJsonStringToEntity(jsonData, com.kms.cura.entity.user.PatientUserEntity.getPatientUserType());
        com.kms.cura.entity.user.PatientUserEntity user = com.kms.cura.dal.user.PatientUserDAL.getInstance().createUser(entity);
        return new com.kms.cura_server.response.UserAPIResponse().successResponsewithType(entity);
    } catch (java.lang.ClassNotFoundException | java.sql.SQLException | com.kms.cura.dal.exception.DALException e) {
        return com.kms.cura_server.response.APIResponse.unsuccessResponse(e.getMessage());
    }
}