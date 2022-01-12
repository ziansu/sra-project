private void updateRoomListString() {
    chatserver.ChatServer.chatRoomListString = "";
    int i = 1;
    synchronized(chatserver.ChatServer.chatRoomList) {
        for (chatRoom.ChatRoom rm : chatserver.ChatServer.chatRoomList) {
            chatserver.ChatServer.chatRoomListString = (((((chatserver.ChatServer.chatRoomListString) + "\n") + (i++)) + ". ") + (rm.getName())) + "\n";
        }
    }
}