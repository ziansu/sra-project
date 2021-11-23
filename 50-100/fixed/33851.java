@java.lang.Override
public cn.gov.baiyin.court.core.entity.User findByUserName(java.lang.String username) {
    java.util.List<cn.gov.baiyin.court.core.entity.User> users = jdbcTemplate.query("select * from user where username=?", new org.springframework.jdbc.core.BeanPropertyRowMapper(cn.gov.baiyin.court.core.entity.User.class), username);
    if (!(org.springframework.util.CollectionUtils.isEmpty(users))) {
        return users.get(0);
    }
    return null;
}