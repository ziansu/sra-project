private void setDefaultAccess(java.sql.Connection con) throws de.uniba.kinf.projm.hylleblomst.exceptions.SetUpException {
    try {
        java.sql.PreparedStatement stmt;
        stmt = con.prepareStatement("CALL SYSCS_UTIL.SYSCS_SET_DATABASE_PROPERTY('derby.database.defaultConnectionMode','readOnlyAccess')");
        stmt.executeUpdate();
    } catch (java.sql.SQLException e) {
        throw new de.uniba.kinf.projm.hylleblomst.exceptions.SetUpException((((e.getSQLState()) + "\n") + (e.getMessage())));
    }
}