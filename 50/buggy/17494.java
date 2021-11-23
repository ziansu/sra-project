public int deleteMessage(int chatId, int messageId) throws java.io.IOException {
    return deleteMessage(java.lang.String.valueOf(chatId), messageId);
}