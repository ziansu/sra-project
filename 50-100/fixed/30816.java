public static int delete(int idFonctionnality, int idMember) {
    java.lang.String sql = "delete from tasks where idMember=? and fonctionnality=?";
    try {
        java.sql.PreparedStatement stmt = com.tbe.database.DataBase.getConnection().prepareStatement(sql);
        stmt.setInt(1, idMember);
        stmt.setInt(2, idFonctionnality);
        return stmt.executeUpdate();
    } catch (java.lang.Exception e) {
        return 0;
    }
}