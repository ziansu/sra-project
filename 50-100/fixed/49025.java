@java.lang.Override
public void run() {
    if (gameId == null) {
        return ;
    }
    games.strategy.util.Tuple<games.strategy.net.GUID, games.strategy.engine.lobby.server.GameDescription> gameToRemove = findGame(gameId);
    if (gameToRemove != null) {
        int index = gameList.indexOf(gameToRemove);
        gameList.remove(gameToRemove);
        fireTableRowsDeleted(index, index);
    }
}