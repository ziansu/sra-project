public void leaveRoom(java.lang.String roomId) {
    mRoomList.remove(roomId);
    com.pokemonshowdown.application.MyApplication.getMyApplication().sendClientMessage(("|/leave " + roomId));
}