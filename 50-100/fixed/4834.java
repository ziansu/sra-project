java.lang.String buildScopeString(java.util.Collection<java.lang.String> scopes, java.lang.String username, java.lang.String realm) {
    java.util.Locale locale = getLocale(username, realm);
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.String scope : scopes) {
        sb.append(resolveScope(scope, locale)).append(", ");
    }
    if (scopes.isEmpty()) {
        return "NONE";
    }else {
        return sb.substring(0, ((sb.length()) - 2));
    }
}