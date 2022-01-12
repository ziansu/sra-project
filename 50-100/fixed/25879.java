public void refresh() {
    com.netboard.message.RefreshMessage refRequestMsg = new com.netboard.message.RefreshMessage(null, null);
    writeMessage(refRequestMsg);
    com.netboard.message.RefreshMessage refResponseMsg = readMessage();
    this.playerInfo = refResponseMsg.getPlayerLobby();
    this.supportedGames = refResponseMsg.getSupportedGames();
    com.netboard.client.NetBoardClient.lobbyGUI.refresh();
}