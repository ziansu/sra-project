public int getEmployeeID(java.lang.String Username) {
    int ID = 0;
    try {
        java.sql.Connection conn = java.sql.DriverManager.getConnection(url, system.dbManager.username, system.dbManager.password);
        java.sql.Statement s = conn.createStatement();
        java.lang.String query = ("SELECT employeeID FROM employee WHERE Username= '" + (getEmployeeUsername())) + "'";
        java.sql.ResultSet rs = s.executeQuery(query);
        ID = rs.getInt(1);
    } catch (java.sql.SQLException e) {
    }
    return ID;
}