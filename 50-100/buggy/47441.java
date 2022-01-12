@java.lang.Override
public com.iri.training.model.User addUser(final com.iri.training.model.User user) throws java.sql.SQLException {
    logger.debug(("ENTERED addUser for user: " + user));
    java.lang.String sql = property.getString("CREATE_USER");
    jdbcTemplate = new org.springframework.jdbc.core.JdbcTemplate(dataSource);
    jdbcTemplate.update(sql, user.getUsername(), user.getName(), user.getSurname(), user.getDateOfBirth(), user.getPhoneNo(), user.getAddress());
    logger.debug(("EXITING addUser: " + user));
    return user;
}