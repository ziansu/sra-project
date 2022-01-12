public void updateEmployeeStatusOut(java.lang.String Username) {
    try {
        conn = java.sql.DriverManager.getConnection(url, system.dbManager.username, system.dbManager.password);
        s = conn.createStatement();
        java.lang.String query = ("UPDATE employee set employeeStatus= 'Deactive' WHERE employeeFName='" + Username) + "'";
        java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.executeUpdate();
        s.close();
        conn.close();
    } catch (java.sql.SQLException exp) {
    }
}