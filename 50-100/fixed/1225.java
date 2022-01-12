private java.lang.String getParentName(java.lang.Long parentId) {
    java.lang.String parentName = null;
    if (parentId != null) {
        org.springframework.jdbc.core.namedparam.MapSqlParameterSource parameters = new org.springframework.jdbc.core.namedparam.MapSqlParameterSource();
        java.lang.String sql = org.egov.tradelicense.persistence.repository.builder.CategoryQueryBuilder.getQueryForParentName(parentId, parameters);
        java.util.List<java.util.Map<java.lang.String, java.lang.Object>> rows = namedParameterJdbcTemplate.queryForList(sql, parameters);
        for (java.util.Map<java.lang.String, java.lang.Object> row : rows) {
            parentName = getString(row.get("name"));
        }
    }
    return parentName;
}