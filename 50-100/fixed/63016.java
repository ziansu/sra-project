private void createUsers(java.sql.Connection con) throws de.uniba.kinf.projm.hylleblomst.exceptions.SetUpException {
    try (java.sql.PreparedStatement stmt = con.prepareStatement("CALL SYSCS_UTIL.SYSCS_CREATE_USER(?, ?)")) {
        createGuestUser(stmt);
    } catch (java.sql.SQLException | de.uniba.kinf.projm.hylleblomst.exceptions.SetUpException e) {
        throw new de.uniba.kinf.projm.hylleblomst.exceptions.SetUpException(e.getMessage());
    }
}