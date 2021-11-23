protected long[] getGroupIds(com.liferay.portal.kernel.search.SearchContext searchContext) {
    long[] groupIds = null;
    long[] groupIdsFromFacetConfiguration = getGroupIdsFromFacetConfiguration();
    if (com.liferay.portal.kernel.util.ArrayUtil.isNotEmpty(groupIdsFromFacetConfiguration)) {
        groupIds = groupIdsFromFacetConfiguration;
    }
    if (com.liferay.portal.kernel.util.ArrayUtil.isEmpty(groupIds)) {
        groupIds = searchContext.getGroupIds();
    }
    long[] groupIdsFromParameter = getGroupIdsFromParameter(searchContext);
    if (com.liferay.portal.kernel.util.ArrayUtil.isNotEmpty(groupIdsFromParameter)) {
        groupIds = groupIdsFromParameter;
    }
    return groupIds;
}