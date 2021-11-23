public void removeRoomOwnership(java.lang.String roomID) {
    if (ownedRooms.remove(roomID)) {
        chat.server.ChatRoom room = chat.server.ConnectionsSupervisor.getChatRoomByID(roomID);
        if (room != null)
            room.setOwnedByAccount(false);
        
    }
}