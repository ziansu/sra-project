public int insertWithGeneratedKey(java.lang.Object entity, java.lang.String insertSql) {
    org.springframework.jdbc.support.KeyHolder keyHolder = new org.springframework.jdbc.support.GeneratedKeyHolder();
    int affectedRows = getNamedParameterJdbcTemplate().update(insertSql, new org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource(entity), keyHolder);
    if ((keyHolder.getKey()) != null) {
        setIdentifierProperty(entity, keyHolder.getKey().longValue());
    }
    return affectedRows;
}