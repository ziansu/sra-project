public void commit() throws cn.dreampie.orm.exception.TransactionException {
    java.sql.Connection conn = dataSourceMeta.getCurrentConnection();
    try {
        if (conn != null) {
            if (((isReadonly) == null) || (!(isReadonly))) {
                if (!(conn.getAutoCommit())) {
                    conn.commit();
                }
            }
        }
    } catch (java.sql.SQLException e) {
        throw new cn.dreampie.orm.exception.TransactionException(e.getMessage(), e.getCause());
    }
}