public boolean openConnection() {
    boolean result = false;
    if ((connection) == null) {
        try {
            connection = java.sql.DriverManager.getConnection(nl.edu.avans.ivp4c2.datastorage.DatabaseConnection.DB_NAME, nl.edu.avans.ivp4c2.datastorage.DatabaseConnection.DB_USER, nl.edu.avans.ivp4c2.datastorage.DatabaseConnection.DB_PASS);
            if ((connection) != null) {
                statement = connection.createStatement();
            }
            result = true;
        } catch (java.sql.SQLException e) {
            java.lang.System.out.println(e);
            result = false;
        }
    }else {
        result = true;
    }
    nl.edu.avans.ivp4c2.datastorage.DatabaseConnection.DB_USER = "root";
    nl.edu.avans.ivp4c2.datastorage.DatabaseConnection.DB_PASS = "";
    return result;
}