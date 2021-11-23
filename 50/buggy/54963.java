@java.lang.Override
public boolean deleteByUser(long userId) {
    java.lang.String sql = "UPDATE t_user_leader SET status=0 WHERE userId=?";
    return (jdbcTemplate.update(sql)) > 0;
}