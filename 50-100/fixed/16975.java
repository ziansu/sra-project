@java.lang.Override
public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getAllVideosbyTheme(java.lang.Long theme_id) {
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> result = null;
    result = getJdbcTemplate().query("SELECT * FROM v_online_videos_by_theme WHERE theme_type = ? ", new java.lang.Object[]{ theme_id }, new org.springframework.jdbc.core.ColumnMapRowMapper());
    java.lang.System.out.println(result);
    return result;
}