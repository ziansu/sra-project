public java.sql.ResultSet getAttributes(java.lang.String c, java.lang.String s, java.lang.String t, java.lang.String a) throws java.sql.SQLException {
    if ((getAttributes) == null) {
        getAttributes = conn.prepareStatement(("select null as TYPE_CAT, null as TYPE_SCHEM, " + ((((("null as TYPE_NAME, null as ATTR_NAME, null as DATA_TYPE, " + "null as ATTR_TYPE_NAME, null as ATTR_SIZE, null as DECIMAL_DIGITS, ") + "null as NUM_PREC_RADIX, null as NULLABLE, null as REMARKS, null as ATTR_DEF, ") + "null as SQL_DATA_TYPE, null as SQL_DATETIME_SUB, null as CHAR_OCTET_LENGTH, ") + "null as ORDINAL_POSITION, null as IS_NULLABLE, null as SCOPE_CATALOG, ") + "null as SCOPE_SCHEMA, null as SCOPE_TABLE, null as SOURCE_DATA_TYPE limit 0;")));
    }
    return getAttributes.executeQuery();
}