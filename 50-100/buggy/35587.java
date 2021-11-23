public int countService(long groupId, java.lang.String keywords, java.lang.String administrationCode, java.lang.String domainCode) {
    java.lang.String[] names = null;
    boolean andOperator = false;
    if (com.liferay.portal.kernel.util.Validator.isNotNull(keywords)) {
        names = com.liferay.util.dao.orm.CustomSQLUtil.keywords(keywords);
    }else {
        andOperator = true;
    }
    return _countService(groupId, names, administrationCode, domainCode, andOperator);
}