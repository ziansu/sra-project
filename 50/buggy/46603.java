private boolean doAddRelationship(org.aming.web.qq.domain.Relationship relationship) {
    java.lang.System.out.println(("保存关系：" + relationship));
    return org.aming.web.qq.utils.NumberUtils.isGreaterThanZero(userDao.saveRelationship(relationship));
}