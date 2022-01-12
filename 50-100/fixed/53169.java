public java.lang.String getMessage(boolean inChatRoom, int fromID) {
    if (!inChatRoom)
        if (hasNewMessage[fromID]) {
            hasNewMessage[fromID] = false;
            return mailbox[fromID];
        }else {
            if (chatRoomHasNewMessage[fromID]) {
                chatRoomHasNewMessage[fromID] = false;
                return chatRoomMailbox[fromID];
            }
        }
    
    return "";
}