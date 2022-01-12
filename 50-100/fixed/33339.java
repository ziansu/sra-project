public boolean sendMessage(com.maxxton.aam.messages.MessageType type, java.lang.String receiver, java.lang.Object payload, java.lang.String responseTo) {
    com.maxxton.aam.messages.BaseMessage message = new com.maxxton.aam.messages.GenerateMessage();
    message.setPayload(payload);
    return this.objCommunication.packAndSend(receiver.toLowerCase(), message, responseTo);
}