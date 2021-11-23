public static boolean getBoolean(java.lang.String preparedSql, java.lang.Object... supportedSQLArg) {
    java.lang.String s = ids.sardine.TransferUtil.getString(preparedSql, supportedSQLArg);
    return (java.lang.Boolean.parseBoolean(s)) || ((_String_.isNumber(s)) && (s.equals("0")));
}