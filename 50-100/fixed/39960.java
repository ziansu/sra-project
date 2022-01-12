public java.util.List<org.opencps.servicemgt.model.ServiceInfo> searchService(long groupId, java.lang.String keywords, java.lang.String administrationCode, java.lang.String domainCode, int start, int end) {
    boolean andOperator = false;
    if (com.liferay.portal.kernel.util.Validator.isNotNull(keywords)) {
    }else {
        andOperator = true;
    }
    return _searchService(groupId, keywords, administrationCode, domainCode, andOperator, start, end);
}