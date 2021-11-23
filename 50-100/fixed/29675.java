@org.springframework.transaction.annotation.Transactional
public com.intita.wschat.models.ChatUser getChatUser(java.security.Principal principal) {
    if (principal == null)
        return null;
    
    java.lang.String chatUserIdStr = principal.getName();
    if (chatUserIdStr == null)
        return null;
    
    java.lang.Long chatUserId = 0L;
    try {
        chatUserId = java.lang.Long.parseLong(chatUserIdStr);
    } catch (java.lang.NumberFormatException e) {
        java.lang.System.out.println(e);
        return null;
    }
    com.intita.wschat.models.ChatUser user = getChatUser(chatUserId);
    return user;
}