@java.lang.Override
public float getReceiverMaxAlt(long date, java.lang.String receiverName) {
    final java.lang.String sql = "select max_alt from OGN_RECEIVER where date=? and receiver_name=?";
    java.lang.Float result = java.lang.Float.NaN;
    try {
        result = jdbcTemplate.queryForObject(sql, java.lang.Float.class, date, receiverName);
    } catch (org.springframework.dao.EmptyResultDataAccessException ex) {
        result = java.lang.Float.NaN;
    }
    return result;
}