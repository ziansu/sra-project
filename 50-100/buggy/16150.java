@java.lang.Override
protected java.lang.Object getPreAuthenticatedPrincipal(javax.servlet.http.HttpServletRequest httpServletRequest) {
    cz.metacentrum.perun.oidc.client.PerunPrincipal pp = cz.metacentrum.perun.oidc.client.PerunUtils.parsePrincipal(httpServletRequest);
    cz.metacentrum.perun.oidc.client.PerunUser user = cz.metacentrum.perun.oidc.client.UsersManager.getInstance().getUserByExtSourceNameAndExtLogin(pp.getExtSourceName(), pp.getUserExtSourceLogin());
    return user.getId();
}