public com.u.bops.biz.domain.ChatMessage getLastMessage(java.lang.String openId, java.lang.String friendOpenId) {
    java.lang.String lastMessageId = getLastMessageId(openId, friendOpenId);
    if (lastMessageId == null) {
        return null;
    }
    return getChatMessage(lastMessageId);
}