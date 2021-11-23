@java.lang.Override
public void deleteItemByProjectDescriptionId(java.lang.String projectDescId, java.lang.String descType) {
    com.psk.pms.dao.ItemDAOImpl.LOGGER.info("method = deleteItemByProjectDescriptionId()");
    java.lang.String DELETEPROJDESCAITEMBYPROJECTDESCID = ("DELETE FROM " + (com.psk.pms.constants.DescriptionType.getDescriptionItemTableName(descType))) + " WHERE ProjDescId = ?";
    int noOfrowsDeleted = jdbcTemplate.update(DELETEPROJDESCAITEMBYPROJECTDESCID, projectDescId);
    com.psk.pms.dao.ItemDAOImpl.LOGGER.info(("No of rows deleted :" + noOfrowsDeleted));
}