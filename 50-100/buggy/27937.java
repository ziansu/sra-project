@java.lang.Override
public server.main.GameInfo buildRoad(server.main.BuildRoad buildRoad) throws server.main.ServerException {
    server.main.BuildRoadCommand buildRoadCommand = new server.main.BuildRoadCommand(buildRoad);
    server.main.GameInfo gi = null;
    if (agent.sendCommand(buildRoadCommand)) {
        gi = server.receiver.AllOfOurInformation.getSingleton().getGames().get(buildRoad.getGameId()).getGame();
        java.lang.System.out.println(("I made it here: " + gi));
    }
    return gi;
}