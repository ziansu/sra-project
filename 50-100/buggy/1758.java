public logic.Tournament getTournament(int ID) throws java.sql.SQLException {
    java.lang.String sql = ("SELECT COUNT(*) AS Count FROM Turniere WHERE ID = " + ID) + ";";
    java.sql.PreparedStatement stmt = logic.Controll.con.prepareStatement(sql);
    java.sql.ResultSet rs = stmt.executeQuery();
    if ((rs.getInt("Count")) == 1) {
        return new logic.Tournament(ID, logic.Controll.con);
    }
    return null;
}