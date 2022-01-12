public <T> java.util.List<T> loadAll(java.lang.Class<T> type) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    com.phlox.asql.ClassInfo classInfo = models.getClassInfo(type);
    java.lang.String query = "SELECT * FROM " + (classInfo.tableName);
    return queryAll(type, query);
}