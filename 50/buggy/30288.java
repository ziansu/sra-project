@java.lang.Override
public boolean validateGrant(org.wso2.carbon.identity.oauth2.token.OAuthTokenReqMessageContext tokReqMsgCtx) throws org.wso2.carbon.identity.oauth2.IdentityOAuth2Exception {
    boolean validateResult = super.validateGrant(tokReqMsgCtx);
    return validateResult;
}