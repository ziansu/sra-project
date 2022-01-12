@java.lang.Override
public java.lang.String getNewSessionAlias(final javax.servlet.http.HttpServletRequest request) {
    final java.util.Set<java.lang.String> sessionAliases = getSessionIds(request).keySet();
    if (sessionAliases.isEmpty())
        return org.egov.infra.config.session.CookieHttpSessionStrategy.DEFAULT_ALIAS;
    
    long lastAlias = java.lang.Long.decode(org.egov.infra.config.session.CookieHttpSessionStrategy.DEFAULT_ALIAS);
    for (final java.lang.String alias : sessionAliases) {
        final long selectedAlias = safeParse(alias);
        if (selectedAlias > lastAlias)
            lastAlias = selectedAlias;
        
    }
    return java.lang.Long.toHexString((lastAlias + 1));
}