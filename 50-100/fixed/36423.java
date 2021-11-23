@org.springframework.transaction.annotation.Transactional(readOnly = true)
public user.repository.User getUser(java.lang.String username) {
    user.repository.User user = null;
    java.lang.String sql = "select a.username, a.hash_password, a.role_id, s.th_prename, s.th_name, s.en_prename, s.en_name, s.email " + ((((("from user_account a " + "join staff s ") + "on a.username = s.username ") + "join user_role r ") + "on r.role_id = a.role_id ") + "where a.username = ?;");
    try {
        user = jdbc.queryForObject(sql, new java.lang.Object[]{ username }, new user.mapper.UserRowMapper());
    } catch (java.lang.Exception ex) {
        throw new user.exception.UserNotFoundException(username);
    }
    return user;
}