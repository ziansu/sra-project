public void rollback() {
    java.sql.Connection conn = dataSourceMeta.getCurrentConnection();
    try {
        if ((conn != null) && (!(isReadonly))) {
            conn.rollback();
        }
    } catch (java.sql.SQLException e) {
        cn.dreampie.orm.transaction.TransactionManager.logger.error((("Could not rollback " + (dataSourceMeta.getDsName())) + " connection."), e.getCause());
    }
}