public static java.lang.String getAdminRestAPIResource() throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    if ((org.wso2.carbon.apimgt.rest.api.common.util.RestApiUtil.adminRestAPIDefinition) == null) {
        try {
            org.wso2.carbon.apimgt.rest.api.common.util.RestApiUtil.adminRestAPIDefinition = org.apache.commons.io.IOUtils.toString(org.wso2.carbon.apimgt.rest.api.common.util.RestApiUtil.class.getResourceAsStream("/admin-api.yaml"), "UTF-8");
        } catch (java.io.IOException e) {
            java.lang.String message = "Error while reading the swagger definition of Admin Rest API";
            org.wso2.carbon.apimgt.rest.api.common.util.RestApiUtil.log.error(message, e);
            throw new org.wso2.carbon.apimgt.rest.api.common.exception.APIMgtSecurityException(message, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.API_NOT_FOUND);
        }
    }
    return org.wso2.carbon.apimgt.rest.api.common.util.RestApiUtil.adminRestAPIDefinition;
}