public static java.lang.Object parseDefaultValue(com.orientechnologies.orient.core.record.impl.ODocument iRecord, final java.lang.String iWord) {
    final java.lang.Object v = com.orientechnologies.orient.core.sql.OSQLHelper.parseValue(iWord, null);
    if (v != (com.orientechnologies.orient.core.sql.OSQLHelper.VALUE_NOT_PARSED)) {
        return v;
    }
    final com.orientechnologies.orient.core.sql.functions.OSQLFunctionRuntime func = com.orientechnologies.orient.core.sql.OSQLHelper.getFunction(null, iWord);
    if (func != null) {
        return func.execute(iRecord, iRecord, null, null);
    }
    return new com.orientechnologies.orient.core.sql.filter.OSQLFilterItemField(null, iWord, iRecord.getSchemaClass());
}