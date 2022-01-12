protected IdentityResponse.IdentityResponseBuilder processLoginRequest(org.wso2.carbon.identity.gateway.context.AuthenticationContext authenticationContext) throws org.wso2.carbon.identity.gateway.processor.handler.FrameworkHandlerException {
    org.wso2.carbon.identity.gateway.api.response.FrameworkHandlerResponse identityFrameworkHandlerResponse = null;
    try {
        identityFrameworkHandlerResponse = validate(authenticationContext);
        if (identityFrameworkHandlerResponse.equals(FrameworkHandlerResponse.CONTINUE)) {
            identityFrameworkHandlerResponse = authenticate(authenticationContext);
        }
        if (identityFrameworkHandlerResponse.equals(FrameworkHandlerResponse.CONTINUE)) {
            identityFrameworkHandlerResponse = buildResponse(authenticationContext);
        }
    } catch (org.wso2.carbon.identity.gateway.processor.handler.authentication.AuthenticationHandlerException e) {
        identityFrameworkHandlerResponse = buildErrorResponse(authenticationContext, e);
    }
    return identityFrameworkHandlerResponse.getIdentityResponseBuilder();
}