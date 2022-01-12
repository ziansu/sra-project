public static boolean getBoolean(java.lang.String sql) {
    java.lang.String s = java.lang.String.valueOf(ids.sardine.TransferUtil.getObject(sql)).trim();
    return _String_.isNumber(s) ? !("0".equals(s)) : java.lang.Boolean.parseBoolean(s);
}