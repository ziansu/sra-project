public static java.lang.StringBuilder escapeLiteral(java.lang.StringBuilder sbuf, java.lang.String value, boolean standardConformingStrings) throws java.sql.SQLException {
    if (sbuf == null) {
        sbuf = new java.lang.StringBuilder(((((value.length()) + 10) / 10) * 11));
    }
    org.postgresql.core.Utils.doAppendEscapedLiteral(sbuf, value, standardConformingStrings);
    return sbuf;
}