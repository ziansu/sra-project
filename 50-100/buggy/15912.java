public java.util.ArrayList<com.pette.server.chattserver.chat.ChatMessage> getUpdate(com.pette.server.common.UpdateRequest request) {
    if (((request.getIndex()) != null) && ((request.getRange()) != null)) {
        return getLastEntries(request.getChatRoomId(), request.getUsername(), request.getIndex(), request.getRange());
    }else {
        return getSlimUpdate(request.getChatRoomId(), request.getUsername());
    }
}