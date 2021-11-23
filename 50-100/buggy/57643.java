private void createUsers(java.sql.Connection con) throws de.uniba.kinf.projm.hylleblomst.exceptions.SetUpException {
    try {
        java.sql.PreparedStatement stmt;
        stmt = con.prepareStatement("CALL SYSCS_UTIL.SYSCS_CREATE_USER(?, ?)");
        createAdminUser(stmt);
        createGuestUser(stmt);
    } catch (java.sql.SQLException | de.uniba.kinf.projm.hylleblomst.exceptions.SetUpException e) {
        throw new de.uniba.kinf.projm.hylleblomst.exceptions.SetUpException(e.getMessage());
    }
}