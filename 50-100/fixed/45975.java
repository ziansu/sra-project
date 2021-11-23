@java.lang.Override
public float getReceiverMaxAlt(long date, java.lang.String receiverName) {
    final java.lang.String sql = "select max_alt from OGN_RECEIVER where date=? and receiver_name=?";
    java.lang.Float result = null;
    try {
        result = jdbcTemplate.queryForObject(sql, java.lang.Float.class, date, receiverName);
    } catch (org.springframework.dao.EmptyResultDataAccessException ex) {
    }
    return result == null ? java.lang.Float.NaN : result;
}