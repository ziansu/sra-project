public boolean hasUnreadMessages(int currentUserId) {
    boolean flag = false;
    java.util.List<in.hikev.message.model.MessageThread> threads = getAllJoinedTalks(currentUserId);
    for (in.hikev.message.model.MessageThread thread : threads) {
        int userId = getUserIdTalkingWith(currentUserId, thread);
        if ((getUnreadMessagesCount(userId, thread.getId())) > 0) {
            flag = true;
            break;
        }
    }
    return flag;
}