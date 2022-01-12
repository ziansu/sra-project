public int deleteEmployee(java.lang.String empId) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.sql.Connection con = com.accenture.tmt.common.DBConnection.getConnection();
    int status = 0;
    try {
        java.lang.String sqlemp = "UPDATE Employee SET ActiveUser = 'No' WHERE EmployeeId = ?";
        java.sql.PreparedStatement stemp = con.prepareStatement(sqlemp);
        stemp.setString(1, empId);
        status = stemp.executeUpdate();
    } finally {
        con.commit();
        con.close();
    }
    return status;
}