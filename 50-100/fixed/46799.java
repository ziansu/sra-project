@java.lang.Override
public boolean authenticate(org.apache.catalina.connector.Request request, javax.servlet.http.HttpServletResponse httpResponse) throws java.io.IOException {
    javax.security.auth.message.config.AuthConfigProvider jaspicProvider = getJaspicProvider();
    if (jaspicProvider == null) {
        return doAuthenticate(request, httpResponse);
    }else {
        org.apache.catalina.connector.Response response = request.getResponse();
        org.apache.catalina.authenticator.AuthenticatorBase.JaspicState jaspicState = getJaspicState(jaspicProvider, request, response, true);
        if (jaspicState == null) {
            return false;
        }
        boolean result = authenticateJaspic(request, response, jaspicState, true);
        secureResponseJspic(request, response, jaspicState);
        return result;
    }
}