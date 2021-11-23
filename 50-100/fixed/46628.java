public boolean hasUnreadMessages(int currentUserId) {
    boolean flag = false;
    for (in.hikev.message.model.MessageThread thread : getAllJoinedTalks(currentUserId)) {
        if ((getUnreadMessagesCount(currentUserId, thread.getId())) > 0) {
            flag = true;
            break;
        }
    }
    return flag;
}