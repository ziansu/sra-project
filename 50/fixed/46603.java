private boolean doAddRelationship(org.aming.web.qq.domain.Relationship relationship) {
    return org.aming.web.qq.utils.NumberUtils.isGreaterThanZero(userDao.saveRelationship(relationship));
}