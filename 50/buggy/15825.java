public static void loadDriver() {
    try {
        java.lang.Class.forName("com.mysql.jdbc.Driver").newInstance();
        com.mattbozelka.repository.DatabaseConnection.driverLoaded = true;
    } catch (java.lang.Exception ex) {
        com.mattbozelka.repository.DatabaseConnection.driverLoaded = false;
    }
}