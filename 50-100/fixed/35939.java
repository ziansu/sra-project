@java.lang.Deprecated
public static org.wso2.carbon.identity.base.IdentityException error(java.lang.String errorDescription, java.lang.Throwable cause) {
    org.wso2.carbon.identity.base.IdentityException identityException = new org.wso2.carbon.identity.base.IdentityException(errorDescription, cause);
    org.wso2.carbon.identity.base.IdentityException.ErrorInfo.ErrorInfoBuilder errorInfoBuilder = new org.wso2.carbon.identity.base.IdentityException.ErrorInfo.ErrorInfoBuilder(errorDescription);
    errorInfoBuilder.cause(cause);
    identityException.addErrorInfo(errorInfoBuilder.build());
    return identityException;
}