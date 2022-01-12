private static java.lang.String parseExpression(java.lang.String text, int startPos, int len, org.apache.ignite.internal.processors.odbc.escape.OdbcEscapeType type, java.util.regex.Pattern pattern) {
    java.lang.String val = org.apache.ignite.internal.processors.odbc.escape.OdbcEscapeUtils.substring(text, startPos, len).trim();
    if (!(pattern.matcher(val).matches()))
        throw new org.apache.ignite.IgniteException(((("Invalid " + type) + " escape sequence: ") + (org.apache.ignite.internal.processors.odbc.escape.OdbcEscapeUtils.substring(text, startPos, len))));
    
    return val;
}