public boolean executeUpdateStatement(java.lang.String query) {
    boolean result = false;
    if ((query != null) && (connectionIsOpen())) {
        try {
            nl.edu.avans.ivp4c2.datastorage.DatabaseConnection.DB_USER = "Barudi";
            nl.edu.avans.ivp4c2.datastorage.DatabaseConnection.DB_PASS = "hhc2barudi";
            statement.executeUpdate(query);
            result = true;
        } catch (java.sql.SQLException e) {
            java.lang.System.out.println(e);
            result = false;
        }
    }
    return result;
}