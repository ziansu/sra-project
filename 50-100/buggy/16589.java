public boolean addDebugGame(com.wegas.core.persistence.game.GameModel gameModel) {
    if (!(gameModel.hasDebugGame())) {
        com.wegas.core.persistence.game.DebugGame debugGame = new com.wegas.core.persistence.game.DebugGame();
        this.addGame(gameModel, debugGame);
        getEntityManager().persist(debugGame);
        gameModel.propagateDefaultInstance(debugGame, true);
        gameFacade.addDebugTeam(debugGame);
        return true;
    }
    return false;
}