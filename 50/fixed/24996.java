@java.lang.Deprecated
public static org.wso2.carbon.identity.base.IdentityException error(java.lang.String errorDescription) {
    org.wso2.carbon.identity.base.IdentityException identityException = new org.wso2.carbon.identity.base.IdentityException(errorDescription);
    org.wso2.carbon.identity.base.IdentityException.ErrorInfo.ErrorInfoBuilder errorInfoBuilder = new org.wso2.carbon.identity.base.IdentityException.ErrorInfo.ErrorInfoBuilder(errorDescription);
    identityException.addErrorInfo(errorInfoBuilder.build());
    return identityException;
}