public java.util.Collection<ru.cdek.example.model.Entity> findAll() throws org.springframework.dao.DataAccessException {
    return this.jdbcTemplate.query(ru.cdek.example.repository.jdbc.JdbcEntityRepositoryImpl.SQL_ENTITIES, org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance(ru.cdek.example.model.Entity.class));
}