public void getID() throws java.sql.SQLException {
    java.lang.String query = "SELECT ID FROM Login ORDER BY ID DESC";
    java.sql.Statement sta = DB.DBConnections.con.createStatement();
    java.sql.ResultSet rs = sta.executeQuery(query);
    while (rs.next()) {
        java.lang.String ID = rs.getString(1);
        DB.DBConnections.id = java.lang.Integer.parseInt(ID);
        (DB.DBConnections.id)++;
    } 
}