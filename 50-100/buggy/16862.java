@java.lang.Override
protected org.wso2.carbon.identity.gateway.authentication.AuthenticationResponse processRequest(org.wso2.carbon.identity.gateway.context.AuthenticationContext context) throws org.wso2.carbon.identity.authenticator.outbound.saml2sso.exception.SAML2SSOAuthenticationException {
    boolean isPost = isPost(getIdentityProviderConfig(context), context);
    boolean isForce = isForce(getIdentityProviderConfig(context), context);
    boolean isPassive = isPassive(getIdentityProviderConfig(context), context);
    org.wso2.carbon.identity.gateway.authentication.AuthenticationResponse authenticationResponse = org.wso2.carbon.identity.gateway.authentication.AuthenticationResponse.INCOMPLETE;
    org.wso2.carbon.identity.gateway.api.response.GatewayResponse.GatewayResponseBuilder builder;
    if (isPost) {
        builder = buildSAML2SSOPostRequest(isForce, isPassive, context);
    }else {
        builder = buildSAML2SSORedirectRequest(isForce, isPassive, context);
    }
    authenticationResponse.setGatewayResponseBuilder(builder);
    return authenticationResponse;
}