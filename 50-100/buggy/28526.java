public java.lang.Boolean login(java.lang.String username, java.lang.String password) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.Boolean res = false;
    java.lang.String query = ((("SELECT username FROM user WHERE username='" + username) + "' AND password='") + password) + "';";
    java.sql.Connection con = null;
    java.sql.ResultSet rs = music.Menu.db.selectQuery(query, con);
    if (rs.next()) {
        curr_user = new music.User(username, password);
        res = true;
    }
    if (con != null) {
        con.close();
    }
    return res;
}