@java.lang.Override
public void run() {
    if (gameId == null) {
        return ;
    }
    games.strategy.util.Tuple<games.strategy.net.GUID, games.strategy.engine.lobby.server.GameDescription> toReplace = findGame(gameId);
    if (toReplace == null) {
        gameList.add(new games.strategy.util.Tuple<games.strategy.net.GUID, games.strategy.engine.lobby.server.GameDescription>(gameId, description));
    }else {
        int replaceIndex = gameList.indexOf(toReplace);
        gameList.set(replaceIndex, new games.strategy.util.Tuple<games.strategy.net.GUID, games.strategy.engine.lobby.server.GameDescription>(gameId, description));
        fireTableRowsUpdated(replaceIndex, replaceIndex);
    }
}