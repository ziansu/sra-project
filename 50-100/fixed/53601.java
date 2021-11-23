@java.lang.Override
public boolean canHandle(org.wso2.carbon.identity.core.bean.context.MessageContext messageContext) {
    if (messageContext instanceof org.wso2.carbon.identity.auth.service.AuthenticationContext) {
        org.wso2.carbon.identity.auth.service.AuthenticationContext authenticationContext = ((org.wso2.carbon.identity.auth.service.AuthenticationContext) (messageContext));
        if ((authenticationContext.getAuthenticationRequest()) != null) {
            java.lang.String authorizationHeader = authenticationContext.getAuthenticationRequest().getHeader(HttpHeaders.AUTHORIZATION);
            if ((org.apache.commons.lang.StringUtils.isNotEmpty(authorizationHeader)) && (authorizationHeader.startsWith(BASIC_AUTH_HEADER))) {
                return true;
            }
        }
    }
    return false;
}