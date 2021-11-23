@java.lang.Override
public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletRequest req = ((javax.servlet.http.HttpServletRequest) (request));
    javax.servlet.http.HttpServletResponse res = ((javax.servlet.http.HttpServletResponse) (response));
    java.util.Map<java.lang.String, java.lang.String> loginInfo = getCredentials(req);
    java.lang.String clientId = loginInfo.get(org.cloudfoundry.identity.uaa.authentication.AbstractClientParametersAuthenticationFilter.CLIENT_ID);
    wrapClientCredentialLogin(req, res, loginInfo, clientId);
    chain.doFilter(req, res);
}