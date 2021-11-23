public void insertGame(java.lang.String nome, int exp) throws concrete.SQLException {
    java.sql.Connection connection = database.DB.openConnection();
    java.sql.PreparedStatement ps = connection.prepareStatement(concrete.GiocoDao.INSERT);
    ps.setString(1, nome);
    ps.setString(2, exp);
    java.sql.ResultSet rset = ps.executeUpdate();
    rset.close();
    ps.close();
}