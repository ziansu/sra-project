public <T> java.util.List<T> list(java.lang.String sql, java.lang.Object[] params, java.lang.Class<T> clazz) {
    java.util.List<T> list = null;
    if ((params == null) || ((params.length) == 0)) {
        list = list(sql, clazz);
    }else {
        list = jdbcTemplate.query(sql, params, new org.springframework.jdbc.core.BeanPropertyRowMapper<T>(clazz));
    }
    return list;
}