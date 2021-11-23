@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getSecurityQuestions(final java.lang.String username) {
    final java.util.Map map = jdbcTemplate.queryForMap(passwordManagementProperties.getJdbc().getSqlSecurityQuestions(), username);
    org.apereo.cas.pm.jdbc.JdbcPasswordManagementService.LOGGER.debug("Found [{}] security questions for [{}]", map.size(), username);
    return map;
}