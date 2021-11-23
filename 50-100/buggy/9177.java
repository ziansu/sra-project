public static boolean getBoolean(java.lang.String sql) {
    java.lang.String s = ids.sardine.TransferUtil.getString(sql);
    return (s != null) && ((java.lang.Boolean.parseBoolean(s.trim())) || (!("0".equals(s.trim()))));
}