public void createTable() throws java.sql.SQLException {
    dropTable();
    java.io.DataInputStream in = new java.io.DataInputStream(getClass().getResourceAsStream(org.jdbdt.tutorial.UserDAO.SQL_TABLE_SCRIPT));
    try {
        byte[] fileContents = new byte[in.available()];
        in.readFully(fileContents);
        executePlainSQL(new java.lang.String(fileContents));
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException("Error reading SQL for table creation", e);
    }
}