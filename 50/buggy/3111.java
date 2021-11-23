public void setGroupsDao(com.huawei.xdu.cm.orm.HibernateDao<com.huawei.xdu.cm.model.ProjectGroups, java.lang.Integer> groupsDao) {
    this.groupsDao = groupsDao;
    this.groupsDao.setEntityClass(com.huawei.xdu.cm.model.ProjectGroups.class);
}