public boolean checkDetails(java.lang.String DOB, java.lang.String email) {
    java.sql.Connection con = pchecker.ServerControl.ConnectDB();
    try {
        java.sql.Statement stmt = ((java.sql.Statement) (con.createStatement()));
        java.lang.String query = "SELECT Email,DOB FROM Account WHERE  ";
        stmt.executeQuery(query);
        java.sql.ResultSet rs = stmt.getResultSet();
        while (rs.next()) {
        } 
    } catch (java.sql.SQLException err) {
    }
}