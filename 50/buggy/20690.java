public int execute(java.lang.String sql, java.lang.Object... params) {
    try {
        return io.stallion.dataAccess.db.DB.instance().newQuery().update(sql, params);
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException(e);
    }
}