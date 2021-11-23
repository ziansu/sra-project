public static java.lang.StringBuilder escapeIdentifier(java.lang.StringBuilder sbuf, java.lang.String value) throws java.sql.SQLException {
    if (sbuf == null) {
        sbuf = new java.lang.StringBuilder((2 + ((((value.length()) + 10) / 10) * 11)));
    }
    org.postgresql.core.Utils.doAppendEscapedIdentifier(sbuf, value);
    return sbuf;
}