public float getVotesAvarege(int idGioco) throws concrete.SQLException {
    float votes_avarage;
    java.sql.Connection connection = database.DB.openConnection();
    java.sql.PreparedStatement ps = con.prepareStatement(concrete.GiocoDao.VOTES_AVARAGE);
    ps.setString(1, idGioco);
    java.sql.ResultSet rset = ps.executeQuery();
    votes_avarage = rset.getFloat("AVG(votazione)");
    return votes_avarage;
}