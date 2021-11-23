public void deleteItemBySubProjectId(java.lang.Integer subProjectId) {
    com.psk.pms.dao.ItemDAOImpl.LOGGER.info("method = deleteItemBySubProjectId()");
    int noOfrowsDeleted = jdbcTemplate.update(com.psk.pms.dao.DELETEPROJDESCITEMBYSUBPROJECTID, new java.lang.Object[]{ subProjectId });
    com.psk.pms.dao.ItemDAOImpl.LOGGER.info(("No of rows deleted :" + noOfrowsDeleted));
}