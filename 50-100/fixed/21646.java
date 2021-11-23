public void sendClientFinishedMessage() {
    Gdx.app.log("Client", "ClientFinishedMessage sent");
    tuc.werkstatt.doubleup.Network.ClientFinishedMessage msg = new tuc.werkstatt.doubleup.Network.ClientFinishedMessage();
    synchronized(lock) {
        msg.gameID = java.util.Arrays.asList(game.minigames).indexOf(currMiniGameName);
        msg.clientID = netClient.getID();
    }
    netClient.sendTCP(msg);
}