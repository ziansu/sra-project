public static java.lang.String escapeAndConvertToSQLWildcards(java.lang.String value, boolean alwaysWildcard) {
    java.lang.String ret = value.replaceAll("\\\\", "\\\\\\\\").replaceAll("_", "\\\\_").replaceAll("%", "\\\\%").replaceAll("\\*", "%").replaceAll("\\?", "_");
    return alwaysWildcard ? ("%" + ret) + "%" : ret;
}