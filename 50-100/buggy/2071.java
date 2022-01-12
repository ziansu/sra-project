private void setAccountsRooms(chat.server.Connection sender, chat.server.Account account) {
    for (chat.server.ChatRoom room : chat.server.ConnectionsSupervisor.getChatRooms()) {
        if (room.getOwner().equals(sender)) {
            java.lang.String roomID = room.getRoomID();
            account.addRoomOwnership(roomID);
        }
    }
}