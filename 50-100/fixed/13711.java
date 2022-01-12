public java.lang.String getUserType(int idUtente) throws concrete.SQLException {
    java.lang.String type = null;
    java.sql.Connection connection = database.DB.openConnection();
    java.sql.PreparedStatement ps = connection.prepareStatement(concrete.UtenteDao.GET_USER_TYPE);
    ps.setString(1, idUtente);
    java.sql.ResultSet rset = ps.executeQuery();
    type = rset.getString("tipo");
    ps.close();
    rset.close();
    return type;
}