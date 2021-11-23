public static java.lang.String getString(java.lang.String sql, java.lang.String... args) {
    java.lang.Object o = ids.sardine.TransferUtil.getObject(sql, args);
    return o == null ? null : java.lang.String.valueOf(o);
}