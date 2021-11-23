public void rollback() {
    com.codefutures.tpcc.TpccStatements.logger.trace("ROLLBACK");
    try {
        conn.rollback();
    } catch (java.sql.SQLException e) {
        com.codefutures.tpcc.TpccStatements.logger.error("ROLLBACK FAILED", e);
    }
}