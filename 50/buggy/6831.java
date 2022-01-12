public void commit() {
    com.codefutures.tpcc.TpccStatements.logger.trace("COMMIT");
    try {
        conn.commit();
    } catch (java.sql.SQLException e) {
        com.codefutures.tpcc.TpccStatements.logger.error("COMMIT FAILED", e);
    }
}