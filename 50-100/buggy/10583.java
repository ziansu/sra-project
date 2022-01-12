private boolean isValideEmail(java.lang.String email) {
    java.sql.Statement stmt;
    boolean status = false;
    java.sql.Connection con = null;
    try {
        bean.ConnectionProvider provider = new bean.ConnectionProvider();
        con = provider.getCon();
        stmt = con.createStatement();
        java.lang.String query = ("Select * from employee where BINARY email=\"" + email) + "\"";
        java.lang.System.out.println(query);
        java.sql.ResultSet rs = stmt.executeQuery(query);
        status = rs.next();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return status;
}