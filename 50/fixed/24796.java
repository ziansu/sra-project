@com.sun.istack.Nullable
@java.lang.Override
public java.lang.String getPlayerEsnByLineId(java.lang.String lineId) {
    java.util.List<java.lang.String> lineIds = getJdbcTemplate().query(com.garmin.di.dao.impl.PlayerDaoImpl.SQL_GET_PLAYER_ESN_BY_LINE_ID, new org.springframework.jdbc.core.SingleColumnRowMapper<java.lang.String>(), lineId);
    return lineIds.isEmpty() ? null : lineIds.get(0);
}