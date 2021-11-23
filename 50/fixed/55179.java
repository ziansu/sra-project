@java.lang.Override
public boolean unstar(long userId, long replyId) {
    if (!(isStared(userId, replyId)))
        return false;
    
    java.lang.String sql = "UPDATE SG_DiscussReplyStar SET Status=0 WHERE ReplyId=? AND UserId=?";
    return update(sql, new java.lang.Object[]{ replyId , userId });
}