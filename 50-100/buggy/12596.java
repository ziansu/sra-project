public org.elasticsearch.action.bulk.BulkResponse bulkIndex(java.lang.String indexName, java.lang.String indexType, java.util.Map<java.lang.String, java.lang.String> idJsonDocMap, boolean refresh) {
    org.elasticsearch.action.bulk.BulkRequestBuilder bulkRequestBuilder = client.prepareBulk();
    for (java.lang.String docId : idJsonDocMap.keySet())
        bulkRequestBuilder.setRefresh(refresh).add(client.prepareIndex(indexName, indexType).setSource(idJsonDocMap.get(docId)));
    
    org.elasticsearch.action.bulk.BulkResponse bulkResponse = bulkRequestBuilder.get();
    if (bulkResponse.hasFailures()) {
        java.lang.System.out.println("FAIL TO INDEX SOME ELEMENTS");
    }
    return bulkResponse;
}