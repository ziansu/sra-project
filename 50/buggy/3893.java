public void leaveRoom(java.lang.String roomId) {
    com.pokemonshowdown.application.MyApplication.getMyApplication().sendClientMessage(("|/leave " + roomId));
    mRoomList.remove(roomId);
}