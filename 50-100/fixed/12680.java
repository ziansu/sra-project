public void save(ru.cdek.example.model.Entity entity) throws org.springframework.dao.DataAccessException {
    org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource paramSource = new org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource(entity);
    java.lang.Number id = this.insertEntity.executeAndReturnKey(paramSource);
    ru.cdek.example.repository.jdbc.JdbcEntityRepositoryImpl.logger.info(java.lang.String.format("Added entity with id - %d (name: %s)", id.intValue(), entity.getName()));
}