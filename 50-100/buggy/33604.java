private static void executeQuery(java.sql.Connection conn, java.lang.String qry) throws java.sql.SQLException {
    try (java.sql.Statement stmnt = conn.createStatement()) {
        stmnt.execute(qry);
        java.sql.SQLWarning warn = stmnt.getWarnings();
        if (warn != null) {
            net.sf.jabref.sql.SQLUtil.LOGGER.warn(warn);
        }
        stmnt.close();
    }
}