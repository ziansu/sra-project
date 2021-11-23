public static void main(java.lang.String[] args) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    package1.Login window = new package1.Login();
    java.lang.Class.forName("com.mysql.jdbc.Driver");
    package1.Login.connection = java.sql.DriverManager.getConnection("jdbc:odbc:ywq");
}