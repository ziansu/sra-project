public int addCounsellor() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    int rowsInserted = 0;
    java.sql.Connection c = com.leadmngmt.util.Database.getConnection();
    java.sql.PreparedStatement statement = c.prepareStatement("INSERT INTO counsellor VALUES(?, ?, ?, ?)");
    statement.setString(1, getEmailId());
    statement.setInt(2, getCurrentNoOfLeads());
    statement.setInt(3, getMaxNoOfLeads());
    statement.setInt(4, getFaculty().getFacultyId());
    rowsInserted = statement.executeUpdate();
    return rowsInserted;
}