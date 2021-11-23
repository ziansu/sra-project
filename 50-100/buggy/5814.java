public static void main(java.lang.String[] args) throws java.sql.SQLException {
    try {
        java.lang.Class.forName("com.mysql.jdbc.Driver");
        test.createDB.connection = java.sql.DriverManager.getConnection(test.createDB.url, "root", "");
        test.createDB.statement = test.createDB.connection.createStatement();
        java.lang.String createDB = "create database test1";
        test.createDB.statement.executeUpdate(createDB);
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
}