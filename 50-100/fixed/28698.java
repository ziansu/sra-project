private void createTable(java.sql.Connection con) {
    try {
        java.lang.String createTableQuery = ((("CREATE TABLE " + (Configuration.sqliteTable)) + " (name VARCHAR2(500) NOT NULL,") + " extension TEXT NOT NULL, path VARCHAR2(500) NOT NULL, filesize INT, lastviewed INT,") + " viewcount INT, tags VARCHAR2(500), hash VARCHAR2(250), toBeDeleted INT, rating INT, reviewed INT)";
        java.sql.Statement stmt;
        stmt = con.createStatement();
        de.dbon.java.vlib.Logger.log(("creating table " + (Configuration.sqliteTable)));
        de.dbon.java.vlib.Logger.log(("sql:" + createTableQuery));
        stmt.executeUpdate(createTableQuery);
        stmt.close();
        con.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}