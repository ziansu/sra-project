public java.util.Collection<ru.cdek.example.model.Entity> findAll() throws org.springframework.dao.DataAccessException {
    java.util.List<ru.cdek.example.model.Entity> entities = this.jdbcTemplate.query(ru.cdek.example.repository.jdbc.JdbcEntityRepositoryImpl.SQL_ENTITIES, org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance(ru.cdek.example.model.Entity.class));
    return entities;
}