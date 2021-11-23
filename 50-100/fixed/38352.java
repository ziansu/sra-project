public void insertReview(java.lang.String testo, int idGioco, int idUtente) throws concrete.SQLException {
    java.sql.Connection connection = database.DB.openConnection();
    java.sql.PreparedStatement ps = connection.prepareStatement(concrete.RecensioneDao.INSERT);
    ps.setString(1, testo);
    ps.setString(2, idGioco);
    ps.setString(3, idUtente);
    java.sql.ResultSet rset = ps.executeUpdate();
    rset.close();
    ps.close();
}