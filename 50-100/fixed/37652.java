public boolean tagMessage(us.categorize.repository.Message message, java.util.List<us.categorize.repository.Tag> tags) {
    java.lang.String tagStatement = "insert into message_tags(message_id, tag_id) values (?,?)";
    try {
        for (us.categorize.repository.Tag tag : tags) {
            java.sql.PreparedStatement stmt = connection.prepareStatement(tagStatement);
            stmt.setLong(1, message.getId());
            stmt.setLong(2, tag.getId());
            stmt.executeUpdate();
        }
        return true;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return false;
}