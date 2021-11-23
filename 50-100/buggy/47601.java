private java.lang.Boolean performRegex(java.lang.String token, java.lang.String regex) {
    boolean retval = false;
    java.lang.String key = sanitize(token);
    java.lang.String pattern = sanitize(regex);
    java.lang.String value = transformContext.resolveToString(key);
    if (value != null)
        retval = java.util.regex.Pattern.compile(regex).matcher(value).find();
    
    return retval;
}