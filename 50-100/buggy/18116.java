public void startGame(int gridsize) {
    java.lang.String msg = server.Server.serverMessageHandler.encode(new messagehandler.message.Message(messagehandler.message.Message.MessageType.STR));
    for (server.ClientThread ct : server.Server.clientThreads) {
        ct.getOut().println(msg);
    }
    server.Server.game = new game.Game(server.Server.info.getPlayers(), gridsize, this);
    java.lang.Thread t = new java.lang.Thread(server.Server.game);
    t.start();
}