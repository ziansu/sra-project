@java.lang.Override
public server.main.GameInfo monopoly(server.main.Monopoly monopoly) throws server.main.ServerException {
    server.main.MonopolyCommand monopolyCommand = new server.main.MonopolyCommand(monopoly);
    server.main.GameInfo gi = null;
    if (agent.sendCommand(monopolyCommand)) {
        gi = server.receiver.AllOfOurInformation.getSingleton().getGames().get(monopoly.getGameId()).getGame();
    }
    return gi;
}