public void accept(final org.geowebcache.diskquota.storage.TileSetVisitor visitor) {
    java.lang.String getTileSet = dialect.getTileSetsQuery(schema);
    final org.geowebcache.diskquota.jdbc.JDBCQuotaStore.TileSetRowMapper tileSetMapper = new org.geowebcache.diskquota.jdbc.JDBCQuotaStore.TileSetRowMapper();
    jt.getJdbcOperations().query(getTileSet, new org.springframework.jdbc.core.RowCallbackHandler() {
        public void processRow(java.sql.ResultSet rs) throws java.sql.SQLException {
            org.geowebcache.diskquota.storage.TileSet tileSet = tileSetMapper.mapRow(rs, 0);
            if (!(org.geowebcache.diskquota.jdbc.JDBCQuotaStore.GLOBAL_QUOTA_NAME.equals(tileSet.getId()))) {
                visitor.visit(tileSet, org.geowebcache.diskquota.jdbc.JDBCQuotaStore.this);
            }
        }
    });
}