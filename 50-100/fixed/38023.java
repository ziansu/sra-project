@java.lang.Override
public void clearCommands(int gameID) throws server.database.DatabaseException {
    java.sql.PreparedStatement stmt = null;
    try {
        java.lang.String clearCommands = "DELETE FROM Commands WHERE gameID = ?";
        stmt = db.getConnection().prepareStatement(clearCommands);
        if ((stmt.executeUpdate()) != 1) {
            throw new server.database.DatabaseException("Could not delete commands from game");
        }
    } catch (java.sql.SQLException e) {
        throw new server.database.DatabaseException("Could not delete commands from game");
    } finally {
        server.database.DatabaseRepresentation.safeClose(stmt);
    }
}