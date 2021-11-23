public java.util.List<in.hikev.message.model.MessageThread> getAllJoinedTalks(int userId) {
    return query("from MessageThread mt where mt.createdBy = ? or mt.sentTo = ?", userId);
}