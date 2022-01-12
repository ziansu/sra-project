public static org.wso2.carbon.identity.base.IdentityException error(org.wso2.carbon.identity.base.IdentityException.ErrorInfo errorInfo) {
    if ((errorInfo == null) || (org.apache.commons.lang.StringUtils.isBlank(errorInfo.errorDescription))) {
        throw new java.lang.IllegalArgumentException("ErrorInfo object is null or Error Description is blank");
    }
    org.wso2.carbon.identity.base.IdentityException identityException = null;
    if ((errorInfo.getCause()) != null) {
        identityException = new org.wso2.carbon.identity.base.IdentityException(errorInfo.getErrorDescription(), errorInfo.getCause());
    }else {
        identityException = new org.wso2.carbon.identity.base.IdentityException(errorInfo.getErrorDescription());
    }
    identityException.addErrorInfo(errorInfo);
    return identityException;
}