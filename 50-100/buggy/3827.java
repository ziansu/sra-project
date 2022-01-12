public static java.sql.ResultSet selectQuery(java.lang.String query, java.sql.Connection con) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.sql.ResultSet rs = null;
    java.sql.Statement stmt;
    try {
        java.lang.Class.forName(music.Main.JDBC_DRIVER);
        java.lang.System.out.println("Connecting to a selected database...");
        con = java.sql.DriverManager.getConnection(music.Main.DB_URL, music.Main.USER, music.Main.PASS);
        java.lang.System.out.println("Connected database successfully...");
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e);
    }
    return rs;
}