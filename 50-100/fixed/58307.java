public java.util.List<com.sampson.pojo.Site> getSites() {
    org.apache.ibatis.session.SqlSession sqlSession = com.sampson.utils.MyBatisUtil.getSqlSessionFactory().openSession();
    if (sqlSession == null) {
        com.sampson.dao.SiteDao.logger.error("obtain SqlSession failure...");
    }
    try {
        com.sampson.mapper.SiteMapper siteMapper = sqlSession.getMapper(com.sampson.mapper.SiteMapper.class);
        return siteMapper.getSites();
    } catch (java.lang.Exception e) {
        com.sampson.dao.SiteDao.logger.error("SiteDao class getSites method exceptioin,get sites list failure...");
    } finally {
        sqlSession.close();
    }
    return null;
}