public static java.sql.ResultSet selectQuery(java.lang.String query, java.sql.Connection con) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.sql.ResultSet rs;
    java.sql.Statement stmt;
    java.lang.Class.forName(music.Main.JDBC_DRIVER);
    con = java.sql.DriverManager.getConnection(music.Main.DB_URL, music.Main.USER, music.Main.PASS);
    stmt = con.createStatement();
    rs = stmt.executeQuery(query);
    return rs;
}