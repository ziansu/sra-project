public int countService(long groupId, java.lang.String keywords, java.lang.String administrationCode, java.lang.String domainCode) {
    boolean andOperator = false;
    if (com.liferay.portal.kernel.util.Validator.isNotNull(keywords)) {
    }else {
        andOperator = true;
    }
    return _countService(groupId, keywords, administrationCode, domainCode, andOperator);
}