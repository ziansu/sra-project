public void removeRoomOwnership(java.lang.String roomID) {
    if (ownedRooms.remove(roomID)) {
        chat.server.ChatRoom room = chat.server.ConnectionsSupervisor.getChatRoomByID(roomID);
        room.setOwnedByAccount(false);
    }
}