@java.lang.Override
public int addLabValue(double labValue, java.lang.String userID) {
    connectToDB();
    try {
        java.lang.String sql = (("DELETE LabValue FROM A1c WHERE userID = " + "'") + userID) + "';";
        statement.executeUpdate(sql);
        java.lang.String sql1 = (((("Insert into A1CReading(labValue, userID) " + "values ('") + userID) + "','") + labValue) + "')";
        return statement.executeUpdate(sql1);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    closeDB();
    return 0;
}