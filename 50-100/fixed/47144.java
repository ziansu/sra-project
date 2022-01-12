public static java.lang.Object getObject(java.lang.String sql, java.lang.String... args) {
    java.util.List<java.lang.Object> l = ids.sardine.TransferUtil.firstColumnValues(true, sql);
    if ((l.size()) == 0)
        return null;
    
    return l.get(0);
}