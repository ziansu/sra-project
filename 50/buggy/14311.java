public void clearState() {
    io.crate.protocols.postgres.Portal portal = portals.remove(io.crate.action.sql.SQLOperations.Session.UNNAMED);
    if (portal != null) {
        portal.close();
    }
    preparedStatements.remove(io.crate.action.sql.SQLOperations.Session.UNNAMED);
}