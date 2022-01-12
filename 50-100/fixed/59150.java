private ca.wasabistudio.chat.entity.Message storeNewMessage(java.lang.String roomKey, java.lang.String sessionId, java.lang.String messageBody) {
    ca.wasabistudio.chat.entity.Room room = getRoom(roomKey);
    if (room == null) {
        throw new ca.wasabistudio.chat.support.RequestErrorException("Room cannot be found.");
    }
    ca.wasabistudio.chat.entity.Client client = getClient(sessionId);
    ca.wasabistudio.chat.entity.Message message = new ca.wasabistudio.chat.entity.Message(client, room, messageBody);
    return saveMessage(room, client, message);
}