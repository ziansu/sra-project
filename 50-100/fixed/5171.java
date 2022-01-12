public static int cancelRegistration(java.sql.Connection connection, int attendanceID) {
    java.sql.PreparedStatement ps = eTrams.utilities.databaseUtilities.SQLOperations.deleteAttendance(connection);
    try {
        ps.setInt(1, attendanceID);
        if ((ps.executeUpdate()) > 0) {
            connection.commit();
            return 1;
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return 0;
}