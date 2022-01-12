public de.fau.cs.mad.wanthavers.common.Message createMessage(java.lang.String chatId, de.fau.cs.mad.wanthavers.common.Message message) {
    return chatEndpoint.createMessage(null, chatId, message);
}