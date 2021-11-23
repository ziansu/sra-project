private java.lang.String generateJWTToken(org.wso2.carbon.apimgt.impl.dto.APIKeyValidationInfoDTO keyValidationInfoDTO, java.lang.String context, java.lang.String version) throws org.wso2.carbon.apimgt.api.APIManagementException {
    return org.wso2.carbon.apimgt.impl.dao.ApiMgtDAO.tokenGenerator.generateToken(keyValidationInfoDTO, context, version);
}