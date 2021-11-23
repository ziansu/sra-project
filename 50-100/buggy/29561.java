public void updateEmployeeStatusOut(java.lang.String Username) {
    try {
        java.sql.Connection conn = java.sql.DriverManager.getConnection(url, system.dbManager.username, system.dbManager.password);
        java.sql.Statement s = conn.createStatement();
        java.lang.String query = ("UPDATE employee set employeeStatus= 'Deactive' WHERE employeeFName='" + Username) + "'";
        java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.executeUpdate();
        s.close();
        conn.close();
    } catch (java.sql.SQLException exp) {
    }
}