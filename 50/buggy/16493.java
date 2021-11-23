void deleteUser() {
    java.lang.String userId = message.getUserId();
    jdbcTemplate.update(hw.oauth2.services.admin.DeleteUser.SQL_DELETE_LOGIN_STATUS, userId);
    jdbcTemplate.update(hw.oauth2.services.admin.DeleteUser.SQL_DELETE_ENTRIES, userId);
    jdbcTemplate.update(hw.oauth2.services.admin.DeleteUser.SQL_DELETE_USER, userId);
}