public java.util.Date getLastUpdated(java.lang.String cruiseID) {
    return jdbcTemplate.queryForObject(no.imr.nmdapi.client.loader.dao.CruiseDAO.GET_LAST_UPDATED, java.util.Date.class, cruiseID);
}