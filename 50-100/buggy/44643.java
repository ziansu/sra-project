@java.lang.Override
public void execute(final java.sql.Connection connection) throws java.sql.SQLException {
    java.sql.Statement stmt = null;
    try {
        stmt = connection.createStatement();
        for (final java.lang.String cmd : org.n52.sos.ds.hibernate.H2Configuration.instance.getDropScript()) {
            stmt.addBatch(cmd);
        }
        for (final java.lang.String cmd : org.n52.sos.ds.hibernate.H2Configuration.instance.getCreateScript()) {
            stmt.addBatch(cmd);
        }
        stmt.executeBatch();
    } finally {
        if (stmt != null) {
            stmt.close();
        }
    }
}