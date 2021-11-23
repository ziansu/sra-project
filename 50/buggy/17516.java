private java.lang.String generateJWTToken(org.wso2.carbon.apimgt.impl.dto.APIKeyValidationInfoDTO keyValidationInfoDTO, java.lang.String context, java.lang.String version) throws org.wso2.carbon.apimgt.api.APIManagementException {
    java.lang.String jwtToken;
    jwtToken = org.wso2.carbon.apimgt.impl.dao.ApiMgtDAO.tokenGenerator.generateToken(keyValidationInfoDTO, context, version);
    return jwtToken;
}