public static java.lang.String getString(java.lang.String sql) {
    java.lang.Object o = ids.sardine.TransferUtil.getObject(sql);
    return o == null ? null : o.toString();
}