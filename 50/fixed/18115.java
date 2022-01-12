@java.lang.Override
public void serverEndsConnection() {
    sendMessageToClient("C219");
    if ((game) != null)
        game.removePlayer(id);
    
}