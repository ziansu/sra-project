private void updateRoomListString() {
    chatserver.ChatServer.chatRoomListString = "";
    int i = 0;
    synchronized(chatserver.ChatServer.chatRoomList) {
        for (chatRoom.ChatRoom rm : chatserver.ChatServer.chatRoomList) {
            chatserver.ChatServer.chatRoomListString = ((((chatserver.ChatServer.chatRoomListString) + (i++)) + ". ") + (rm.getName())) + "\n";
        }
    }
}