public void deleteGame(int idGioco) throws concrete.SQLException {
    java.sql.Connection connection = database.DB.openConnection();
    java.sql.PreparedStatement ps = con.prepareStatement(concrete.GiocoDao.DELETE);
    ps.setString(1, idGioco);
    java.sql.ResultSet rset = ps.executeUpdate();
    rset.close();
    ps.close();
}