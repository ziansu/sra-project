public static <T> T getByReflection(java.lang.Class<T> clazz, java.lang.String sql, java.lang.Object... args) {
    java.util.List<T> list = com.jdbc.common.JDBCDao.getForList(clazz, sql, args);
    if ((list.size()) > 0) {
        return list.get(0);
    }
    return null;
}