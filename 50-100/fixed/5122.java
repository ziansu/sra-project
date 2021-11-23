public void saveCommand(server.command.ICommand command, int gameId) {
    this.persistence.beginTransaction();
    server.IGameAccess gameAccessObject = this.persistence.getGameAccessObject();
    gameAccessObject.saveCommand(command, gameId);
    if ((gameAccessObject.getCommandAmount(gameId)) == (interval)) {
        gameAccessObject.saveGame(this.getGameWithNumber(gameId), gameId);
        gameAccessObject.deleteGameCommands(gameId);
    }
    this.persistence.endTransaction();
}