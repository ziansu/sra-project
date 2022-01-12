public void remove(by.expertsoft.butko.phone.Phone phone) {
    org.springframework.jdbc.core.namedparam.SqlParameterSource namedParameters = new org.springframework.jdbc.core.namedparam.MapSqlParameterSource("m_id", java.lang.Integer.valueOf(phone.getId()));
    namedParameterJdbcTemplate.update(by.expertsoft.butko.dao.phone.JdbcPhoneDao.SQL_DELETE_FROM_MOBILEPHONES, namedParameters);
    namedParameters = new org.springframework.jdbc.core.namedparam.MapSqlParameterSource("p_id", java.lang.Integer.valueOf(phone.getManufacturer().getProducer_id()));
    int count = namedParameterJdbcTemplate.queryForObject(by.expertsoft.butko.dao.phone.JdbcPhoneDao.SQL_SELECT_COUNT_BY_PRODUCER_ID, namedParameters, java.lang.Integer.class);
    if (count == 0) {
        namedParameterJdbcTemplate.update(by.expertsoft.butko.dao.phone.JdbcPhoneDao.SQL_DELETE_FROM_PRODUCERS, namedParameters);
    }
}