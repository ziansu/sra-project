public java.util.List<org.opencps.servicemgt.model.ServiceInfo> searchService(long groupId, java.lang.String keywords, java.lang.String administrationCode, java.lang.String domainCode, int start, int end) {
    java.lang.String[] names = null;
    boolean andOperator = false;
    if (com.liferay.portal.kernel.util.Validator.isNotNull(keywords)) {
        names = com.liferay.util.dao.orm.CustomSQLUtil.keywords(keywords);
    }else {
        andOperator = true;
    }
    return _searchService(groupId, names, administrationCode, domainCode, andOperator, start, end);
}