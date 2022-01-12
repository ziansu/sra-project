public static void main(java.lang.String[] args) {
    gui.GUI g = new gui.GUI();
    business.DBConnection dbcon = new business.DBConnection();
    try {
        business.DBQuery query = new business.DBQuery(dbcon.getConnection());
        java.sql.ResultSet rs = query.sendQuery("SELECT * FROM film");
        business.DBQuery.toString(rs, "titel", "id");
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}