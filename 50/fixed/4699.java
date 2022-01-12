public static java.lang.String checkNullString(com.quinsoft.zeidon.Application app, java.lang.Object string) {
    if (string == null)
        return null;
    
    if (string.equals(com.quinsoft.zeidon.domains.StringDomain.EMPTY_STRING))
        return app.nullStringEqualsEmptyString() ? null : com.quinsoft.zeidon.domains.StringDomain.EMPTY_STRING;
    
    return string.toString();
}