public int countDossierByKeywordDomainAndStatus(long groupId, java.lang.String keyword, java.lang.String domainCode, java.util.List<java.lang.String> govAgencyCodes, java.lang.String dossierStatus) {
    java.lang.String[] keywords = null;
    boolean andOperator = false;
    if (com.liferay.portal.kernel.util.Validator.isNotNull(keyword)) {
        keywords = new java.lang.String[]{ com.liferay.portal.kernel.util.StringUtil.quote(com.liferay.portal.kernel.util.StringUtil.toLowerCase(keyword).trim(), StringPool.PERCENT) };
    }else {
        andOperator = true;
    }
    return countDossierByKeywordDomainAndStatus(groupId, keywords, domainCode, govAgencyCodes, dossierStatus, andOperator);
}