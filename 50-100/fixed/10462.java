public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getRecentVideos(java.lang.Integer pageNo, java.lang.Integer pageSize) {
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> result = null;
    int offset = ((pageNo - 1) * pageSize) + 1;
    java.lang.String selectQuery = "SELECT * FROM ( SELECT * FROM v_online_videos ) AS tbl WHERE tbl.sl_no BETWEEN ? AND ? ";
    result = getJdbcTemplate().query(selectQuery, new java.lang.Object[]{ offset , offset + pageSize }, new org.springframework.jdbc.core.ColumnMapRowMapper());
    return result;
}