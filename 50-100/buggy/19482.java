public boolean reviewAlreadyMadeByUser(int idUtente, int idGioco) throws concrete.SQLException {
    boolean already_made = false;
    java.sql.Connection connection = database.DB.openConnection();
    java.sql.PreparedStatement ps = con.prepareStatement(concrete.RecensioneDao.ALREADY_MADE);
    ps.setString(1, idUtente);
    ps.setString(2, idGioco);
    java.sql.ResultSet rset = ps.executeQuery();
    if ((rset.geInt("total")) == 1) {
        already_made = true;
    }
    ps.close();
    rset.close();
    return already_made;
}