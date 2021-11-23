@java.lang.Override
public void serverEndsConnection() {
    sendMessageToClient("C219");
    game.removePlayer(id);
}