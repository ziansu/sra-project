public int getMaxID() {
    java.lang.String sql = "SELECT MAX(ID) FROM CONTACTS";
    java.sql.ResultSet rs = executeQuery(sql);
    int id = -1;
    try {
        id = rs.getInt(1);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return id;
}