private boolean ethnicityIdsChanged(final java.util.List<java.lang.Integer> newIds, final long studentId) {
    final java.util.List<java.lang.Integer> existingIds = namedParameterJdbcTemplate.queryForList(findlAllStudentEthnicityIdsSql, new org.springframework.jdbc.core.namedparam.MapSqlParameterSource("student_id", studentId), java.lang.Integer.class);
    if ((existingIds.size()) != (newIds.size()))
        return true;
    
    for (final java.lang.Integer existingId : existingIds) {
        if (!(newIds.contains(existingId)))
            return true;
        
    }
    return false;
}