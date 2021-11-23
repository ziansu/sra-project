public int getCountOfStorageType(java.lang.String type) {
    org.springframework.jdbc.core.JdbcTemplate jdbcTemplate = new org.springframework.jdbc.core.JdbcTemplate(dataSource);
    java.lang.String sql = "SELECT COUNT(*) FROM storage WHERE type = ?";
    return jdbcTemplate.queryForObject(sql, java.lang.Integer.class);
}