@java.lang.Override
public java.util.List<server.commands.IMovesCommand> loadUnexecutedCommands() {
    java.util.ArrayList<server.model.ServerGame> games;
    try {
        games = gameDAO.getAll();
        java.util.ArrayList<java.lang.Integer> indeces = new java.util.ArrayList<java.lang.Integer>();
        for (server.model.ServerGame game : games) {
            indeces.add(game.getNumberOfCommands());
        }
        return commandDAO.getCommandsByGameAfterIndex(games, indeces);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return null;
    }
}