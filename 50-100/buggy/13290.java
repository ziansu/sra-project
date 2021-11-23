public java.lang.String getNewSessionAlias(javax.servlet.http.HttpServletRequest request) {
    java.util.Set<java.lang.String> sessionAliases = getSessionIds(request).keySet();
    if (sessionAliases.isEmpty()) {
        return org.egov.infra.config.session.CookieHttpSessionStrategy.DEFAULT_ALIAS;
    }
    long lastAlias = java.lang.Long.decode(org.egov.infra.config.session.CookieHttpSessionStrategy.DEFAULT_ALIAS);
    for (java.lang.String alias : sessionAliases) {
        long selectedAlias = safeParse(alias);
        if (selectedAlias > lastAlias) {
            lastAlias = selectedAlias;
        }
    }
    return java.lang.Long.toHexString((lastAlias + 1));
}