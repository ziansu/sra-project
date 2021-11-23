@java.lang.Override
public void authenticationFailed(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, org.apache.sling.auth.core.spi.AuthenticationInfo authenticationInfo) {
    final com.adobe.acs.samples.authentication.impl.SampleLoginHookAuthenticationHandler.DeferredRedirectHttpServletResponse deferredRedirectResponse = new com.adobe.acs.samples.authentication.impl.SampleLoginHookAuthenticationHandler.DeferredRedirectHttpServletResponse(httpServletRequest, httpServletResponse);
    if (this.wrappedIsAuthFeedbackHandler) {
        ((org.apache.sling.auth.core.spi.AuthenticationFeedbackHandler) (wrappedAuthHandler)).authenticationFailed(httpServletRequest, deferredRedirectResponse, authenticationInfo);
    }
    try {
        deferredRedirectResponse.releaseRedirect();
    } catch (java.io.IOException e) {
        com.adobe.acs.samples.authentication.impl.SampleLoginHookAuthenticationHandler.log.error("Could not release redirect", e);
        httpServletResponse.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
}