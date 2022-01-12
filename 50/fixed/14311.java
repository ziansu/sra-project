public void clearState() {
    portals.remove(io.crate.action.sql.SQLOperations.Session.UNNAMED);
    preparedStatements.remove(io.crate.action.sql.SQLOperations.Session.UNNAMED);
}