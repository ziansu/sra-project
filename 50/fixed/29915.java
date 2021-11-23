@java.lang.Override
public void serverCreated(net.server.ServerThread server) {
    server.addKnownMessageType(GameStateExchange.gameUpdate);
    new game.GameServerThread(server).start();
}