private boolean joinGroup(long groupId) throws java.io.IOException {
    writeOpcode(socket, ChatService.JOIN_GROUP);
    writeLong(socket, groupId);
    writeLong(socket, userId);
    if ((readOpCode(socket)) != (group_chats.server.ChatService.JOIN_GROUP)) {
        java.lang.System.out.println("Failed to join group");
        return false;
    }
    groupId = readLong(socket);
    if (!(silent))
        java.lang.System.out.println("Joined group");
    
    return true;
}