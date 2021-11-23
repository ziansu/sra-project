public void leaveRoom() {
    Games.RealTimeMultiplayer.leave(connectionManager.client, this, currentRoom.getRoomId());
    this.showSignedInFragment();
}