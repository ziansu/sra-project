@java.lang.Override
public void deleteBatch(java.util.List<?> l) {
    org.elasticsearch.action.bulk.BulkRequestBuilder bulkRequest = de.mpg.imeji.logic.search.elasticsearch.ElasticService.getClient().prepareBulk();
    for (java.lang.Object obj : l) {
        java.lang.String id = getId(obj);
        if (id != null) {
            bulkRequest.add(getDeleteRequest(id, de.mpg.imeji.logic.search.elasticsearch.ElasticIndexer.getParent(obj)));
        }
    }
    bulkRequest.get();
    commit();
}