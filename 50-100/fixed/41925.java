public void demoteUser(int idModeratore, int idUtente) throws concrete.SQLException {
    java.sql.Connection connection = database.DB.openConnection();
    java.sql.PreparedStatement ps = connection.prepareStatement(concrete.UtenteDao.DEMOTE_USER);
    ps.setString(1, idUtente);
    java.sql.ResultSet rset = ps.executeUpdate();
    ps.close();
    rset.close();
}