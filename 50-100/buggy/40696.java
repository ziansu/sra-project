public boolean existe(int idMembre) throws ca.qc.collegeahuntsic.bibliotheque.exception.DAOException {
    try {
        getStmtExiste().setInt(1, idMembre);
        java.sql.ResultSet rset = getStmtExiste().executeQuery();
        boolean membreExiste = rset.next();
        rset.close();
        return membreExiste;
    } catch (java.sql.SQLException sqlException) {
        throw new ca.qc.collegeahuntsic.bibliotheque.exception.DAOException(sqlException);
    }
}