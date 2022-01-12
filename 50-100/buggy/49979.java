@java.lang.Override
public <T> alien4cloud.dao.model.GetMultipleDataResult<T> search(java.lang.Class<T> clazz, java.lang.String searchText, java.util.Map<java.lang.String, java.lang.String[]> filters, org.elasticsearch.index.query.FilterBuilder customFilter, java.lang.String fetchContext, int from, int maxElements) {
    org.elasticsearch.action.search.SearchResponse searchResponse = doSearch(clazz, searchText, filters, customFilter, fetchContext, from, maxElements, false);
    return toGetMultipleDataResult(clazz, searchResponse, from);
}