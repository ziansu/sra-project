public void readyButtonPressed() {
    com.mygdx.game.client.model.lobby.ClientLobbyPlayer player = lobbyManager.getLocalLobbyPlayer();
    if ((!(player.isReady())) && ((player.getClass()) != null)) {
        player.setReady(true);
    }else {
        player.setReady(false);
    }
    sendReadyMessage(player.isReady());
}