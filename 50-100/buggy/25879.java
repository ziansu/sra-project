public void refresh() {
    com.netboard.message.RefreshMessage refRequestMsg = new com.netboard.message.RefreshMessage(null, null);
    com.netboard.message.CommsBridge.writeMessage(s, refRequestMsg);
    com.netboard.message.RefreshMessage refResponseMsg = com.netboard.message.CommsBridge.readMessage(s);
    this.playerInfo = refResponseMsg.getPlayerLobby();
    this.supportedGames = refResponseMsg.getSupportedGames();
    com.netboard.client.NetBoardClient.lobbyGUI.refresh();
}