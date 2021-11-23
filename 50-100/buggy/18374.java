public static java.lang.String toCamelCase(java.lang.String... params) {
    if ((params == null) || ((params.length) == 0))
        return null;
    
    java.lang.String result = null;
    for (java.lang.String value : params) {
        result = (result == null) ? value : (result + (value.substring(0, 1).toUpperCase())) + (value.substring(1));
    }
    return result;
}