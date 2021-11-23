public static org.wso2.carbon.apimgt.rest.api.util.exception.ConflictException buildConflictException(java.lang.String message, java.lang.String description) {
    org.wso2.carbon.apimgt.rest.api.util.dto.ErrorDTO errorDTO = org.wso2.carbon.apimgt.rest.api.util.utils.RestApiUtil.getErrorDTO(message, 409L, description);
    return new org.wso2.carbon.apimgt.rest.api.util.exception.ConflictException(errorDTO);
}