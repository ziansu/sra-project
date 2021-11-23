public void execute(java.lang.String SQL) {
    java.sql.Statement stat = null;
    try {
        stat = conn.createStatement();
        stat.execute(SQL);
        conn.commit();
    } catch (java.lang.Exception e) {
        com.lumens.connector.database.DbUtils.rollback(conn);
        throw new java.lang.RuntimeException(e);
    } finally {
        com.lumens.connector.database.DbUtils.releaseStatement(stat);
    }
}