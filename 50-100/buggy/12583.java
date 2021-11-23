public int getMaxID() {
    java.lang.String sql = "SELECT MAX(ID) FROM CONTACTS";
    java.sql.ResultSet rs = executeQuery(sql);
    int id = ((int) (java.lang.Math.random())) * 100;
    try {
        id = rs.getInt("ID");
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return id;
}