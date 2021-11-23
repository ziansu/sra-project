@java.lang.Override
public void run() {
    games.strategy.util.Tuple<games.strategy.net.GUID, games.strategy.engine.lobby.server.GameDescription> toReplace = findGame(gameId);
    int replaceIndex = gameList.indexOf(toReplace);
    gameList.set(replaceIndex, new games.strategy.util.Tuple<games.strategy.net.GUID, games.strategy.engine.lobby.server.GameDescription>(gameId, description));
    fireTableRowsUpdated(replaceIndex, replaceIndex);
}