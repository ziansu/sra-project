@java.lang.Deprecated
public static org.wso2.carbon.identity.base.IdentityException error(java.lang.String errorDescription) {
    org.wso2.carbon.identity.base.IdentityException identityException = new org.wso2.carbon.identity.base.IdentityException(errorDescription);
    return identityException;
}