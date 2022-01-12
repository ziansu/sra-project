public <T> T get(java.lang.String name, java.lang.String value, final java.lang.Class<T> clazz) {
    com.robert.dbsplit.util.SqlUtil.SqlRunningBean srb = com.robert.dbsplit.util.SqlUtil.generateSelectSql(name, value, clazz);
    T bean = this.queryForObject(srb.getSql(), srb.getParams(), new org.springframework.jdbc.core.RowMapper<T>() {
        public T mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
            return com.robert.dbsplit.util.OrmUtil.convertRow2Bean(rs, clazz);
        }
    });
    return bean;
}