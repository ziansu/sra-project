public java.util.List<org.smartdata.model.SystemInfo> getByProperty(java.lang.String property) {
    org.springframework.jdbc.core.JdbcTemplate jdbcTemplate = new org.springframework.jdbc.core.JdbcTemplate(dataSource);
    return jdbcTemplate.query((("select * from " + (TABLE_NAME)) + " where property = ?"), new java.lang.Object[]{ property }, new org.smartdata.metastore.dao.SystemInfoDao.SystemInfoRowMapper());
}