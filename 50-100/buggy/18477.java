private static void insertResourceData(com.hangum.tadpole.engine.query.dao.system.ExecutedSqlResourceDAO userDBResource, java.lang.String contents) throws com.hangum.tadpole.commons.exception.TadpoleSQLManagerException, java.sql.SQLException {
    com.ibatis.sqlmap.client.SqlMapClient sqlClient = com.hangum.tadpole.engine.manager.TadpoleSQLManager.getInstance(com.hangum.tadpole.engine.initialize.TadpoleSystemInitializer.getUserDB());
    com.hangum.tadpole.engine.query.dao.system.ExecutedSqlResourceDataDAO dataDao = new com.hangum.tadpole.engine.query.dao.system.ExecutedSqlResourceDataDAO();
    dataDao.setExecuted_sql_resource_seq(userDBResource.getSeq());
    java.lang.String[] arrayContent = com.hangum.tadpole.engine.sql.util.SQLUtil.makeResourceDataArays(contents);
    for (java.lang.String content : arrayContent) {
        dataDao.setDatas(content);
        sqlClient.insert("userExecuteSQLResourceDataInsert", dataDao);
    }
}