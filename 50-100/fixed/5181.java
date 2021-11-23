protected long[] getGroupIds(com.liferay.portal.kernel.search.SearchContext searchContext) {
    long[] groupIds = getGroupIdsFromFacetConfiguration();
    if (com.liferay.portal.kernel.util.ArrayUtil.isEmpty(groupIds)) {
        groupIds = getGroupIdsFromParameter(searchContext);
    }
    if (com.liferay.portal.kernel.util.ArrayUtil.isEmpty(groupIds)) {
        groupIds = searchContext.getGroupIds();
    }
    return groupIds;
}