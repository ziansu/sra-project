public void addCommand(int gameID, java.lang.String jsonCommand) {
    plugin.startTransaction();
    try {
        if (!(hasReachedDelta(gameID))) {
            plugin.getCommandDAO().createCommand(gameID, jsonCommand);
        }else {
            saveGame(gameID);
            plugin.getCommandDAO().clearCommands(gameID);
        }
    } catch (server.database.DatabaseException e) {
        e.printStackTrace();
    }
    plugin.endTransaction();
}