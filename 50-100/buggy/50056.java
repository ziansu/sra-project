public java.lang.String getEmployeeUsername() {
    java.lang.String Username = "";
    try {
        java.sql.Connection conn = java.sql.DriverManager.getConnection(url, system.dbManager.username, system.dbManager.password);
        java.sql.Statement s = conn.createStatement();
        java.lang.String selectQuery = "SELECT employeeID FROM employee'";
        java.sql.ResultSet rs = s.executeQuery(selectQuery);
        while (rs.next()) {
            Username = rs.getString("employeeID");
        } 
        s.close();
        conn.close();
    } catch (java.sql.SQLException exp) {
    }
    return Username;
}