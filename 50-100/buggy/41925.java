public void demoteUser(int idModeratore, int idUtente) throws concrete.SQLException {
    if ((new concrete.UtenteDao().getUserType(idModeratore)) == "M") {
        java.sql.Connection connection = database.DB.openConnection();
        java.sql.PreparedStatement ps = con.prepareStatement(concrete.UtenteDao.DEMOTE_USER);
        ps.setString(1, idUtente);
        java.sql.ResultSet rset = ps.executeUpdate();
        ps.close();
        rset.close();
    }
}