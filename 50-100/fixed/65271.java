public int getLevel(java.lang.String player, java.lang.String group) {
    int level = 0;
    try {
        java.sql.Statement st = con.createStatement();
        java.sql.ResultSet rs = st.executeQuery((((("SELECT * FROM " + (prefix)) + group) + " WHERE player=") + player));
        if (rs.next()) {
            level = rs.getInt("level");
        }
    } catch (java.sql.SQLException e) {
    }
    return level;
}