public <T> void loadAll(final java.lang.Class<T> type, final com.phlox.asql.ASQL.ResultCallback<java.util.List<T>> callback) {
    com.phlox.asql.ClassInfo classInfo = models.getClassInfo(type);
    java.lang.String query = "SELECT * FROM " + (classInfo.tableName);
    queryAll(type, "", null, callback);
}