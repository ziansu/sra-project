@java.lang.Override
public boolean star(long userId, int replyId) {
    if (isStared(userId, replyId))
        return false;
    
    java.lang.String sql = "INSERT INTO SG_DiscussReplyStar (ReplyId, UserId, AddTime) VALUES (?, ?, NOW())";
    return update(sql, new java.lang.Object[]{ replyId , userId });
}