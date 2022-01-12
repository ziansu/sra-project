public void closeConnection() {
    try {
        dbConn.close();
        java.lang.String closeMessage = "Connection to database closed";
        java.lang.System.out.println(closeMessage);
    } catch (java.sql.SQLException se) {
        se.printStackTrace();
        java.lang.System.out.println("Error trying to close the database");
    }
}