public java.lang.String verifyStay(java.lang.String userName, java.lang.String houseID, java.sql.Statement stmt) {
    java.lang.String result = null;
    java.lang.String sql = ((("SELECT V.hid FROM Visits V WHERE V.login = '" + userName) + "' AND V.hid = '") + userName) + "';";
    java.sql.ResultSet rs = null;
    try {
        rs = stmt.executeQuery(sql);
        if (rs.isBeforeFirst()) {
            result = houseID;
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return result;
}