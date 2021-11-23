public void addCommand(int gameID, java.lang.String jsonCommand) {
    plugin.startTransaction();
    try {
        if (!(hasReachedDelta(gameID))) {
            plugin.getCommandDAO().createCommand(gameID, jsonCommand);
        }else {
            saveGame(gameID);
            plugin.getCommandDAO().clearCommands(gameID);
            plugin.getCommandDAO().createCommand(gameID, jsonCommand);
        }
    } catch (server.database.DatabaseException e) {
        e.printStackTrace();
    }
    plugin.endTransaction();
}