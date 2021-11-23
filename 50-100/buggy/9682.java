public void update(by.expertsoft.butko.phone.Phone phone) {
    java.util.Map<java.lang.String, java.math.BigDecimal> params = new java.util.HashMap<>();
    params.put("name", phone.getName());
    params.put("cost", phone.getPrice());
    params.put("p_id", phone.getManufacturer().getProducer_id());
    namedParameterJdbcTemplate.update(by.expertsoft.butko.dao.phone.JdbcPhoneDao.SQL_UPDATE_MOBILEPHONES, params);
}