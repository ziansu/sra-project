private java.util.ArrayList<com.pette.server.chattserver.chat.ChatMessage> getLastEntries(java.lang.String chatRoomId, int index, int range) {
    com.pette.server.chattserver.chat.ChatRoom room = chatRooms.get(chatRoomId);
    return room.getLastMessages(index, range);
}