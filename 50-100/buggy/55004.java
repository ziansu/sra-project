public void readyButtonPressed() {
    com.mygdx.game.client.model.lobby.ClientLobbyPlayer player = lobbyManager.getLocalLobbyPlayer();
    if (player.isReady()) {
        player.setReady(false);
    }else {
        player.setReady(true);
    }
    sendReadyMessage(player.isReady());
}