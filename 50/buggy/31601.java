public void startConnection() {
    myConnection = null;
    try {
        myConnection = java.sql.DriverManager.getConnection(SQLConnection.SQL_URL);
        java.lang.System.out.println("connected success");
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("Error connecting");
        e.printStackTrace();
    }
}