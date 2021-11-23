public java.lang.String getVilleParCP(int cp) throws java.sql.SQLException {
    this.stmt = DBConnection.con.prepareStatement(Model.DBInteraction.SEL_VILLE_PAR_CP);
    this.stmt.setInt(1, cp);
    java.sql.ResultSet rs = this.stmt.executeQuery();
    rs.next();
    return rs.getString("ville");
}