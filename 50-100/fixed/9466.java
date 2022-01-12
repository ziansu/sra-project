public static java.math.BigDecimal tryBigDecimal(java.lang.String preparedSql, java.lang.Object... supportedSQLArg) {
    java.lang.Object object = ids.sardine.TransferUtil.getObject(preparedSql, supportedSQLArg);
    if (object instanceof java.math.BigDecimal) {
        return ((java.math.BigDecimal) (object));
    }
    java.lang.String s = java.lang.String.valueOf(object).trim();
    return _String_.isNumeric(s) ? new java.math.BigDecimal(s) : null;
}