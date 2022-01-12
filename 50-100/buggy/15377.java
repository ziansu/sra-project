@java.lang.Override
public void delete(java.sql.Connection connection, model.Attachment attachment) throws java.sql.SQLException {
    try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM `contacts_maltsev`.`attachment` WHERE `id` = ?")) {
        preparedStatement.setObject(1, attachment.getId());
        preparedStatement.executeUpdate();
    } catch (java.sql.SQLException e) {
        dao.mysqlimplementation.MySqlAttachmentDao.LOG.warn("can't delete attachment id = {}", attachment.getId(), e);
        throw new java.sql.SQLException();
    }
}