private void cacheAuthentication(final javax.servlet.http.HttpServletRequest request, final org.jasig.cas.client.jetty.CasAuthentication authentication) {
    final javax.servlet.http.HttpSession session = request.getSession(false);
    if (session != null) {
        session.setAttribute(org.jasig.cas.client.jetty.CasAuthenticator.CACHED_AUTHN_ATTRIBUTE, authentication);
        sessionMap.put(authentication.getTicket(), new java.lang.ref.WeakReference<javax.servlet.http.HttpSession>(session));
    }
}