private com.facebook.core.model.FacebookFeedEntry getFacebookFeedEntryFromResultSet(java.sql.ResultSet rs) throws java.sql.SQLException {
    com.facebook.core.model.FacebookFeedEntry result = new com.facebook.core.model.FacebookFeedEntry();
    result.setId(rs.getString("id").trim());
    result.setContent(rs.getString("content").trim());
    result.setStatus(com.facebook.core.model.types.FacebookFeedEntryStatus.valueOf(rs.getString("status")));
    result.setUserId(rs.getInt("user_id"));
    return result;
}