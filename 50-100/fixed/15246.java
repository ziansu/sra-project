public void createTable() throws java.io.IOException, java.sql.SQLException {
    dropTable();
    try (java.io.DataInputStream in = new java.io.DataInputStream(getClass().getResourceAsStream(org.jdbdt.tutorial.UserDAO.SQL_TABLE_SCRIPT))) {
        byte[] fileContents = new byte[in.available()];
        in.readFully(fileContents);
        executePlainSQL(new java.lang.String(fileContents));
    }
}