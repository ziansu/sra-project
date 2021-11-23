public org.elasticsearch.action.bulk.BulkResponse bulkIndex(java.lang.String indexName, java.lang.String indexType, java.util.Map<java.lang.String, java.lang.String> idJsonDocMap, boolean refresh) {
    org.elasticsearch.action.bulk.BulkRequestBuilder bulkRequestBuilder = client.prepareBulk().setRefresh(refresh);
    for (java.lang.String docId : idJsonDocMap.keySet()) {
        bulkRequestBuilder.add(client.prepareIndex(indexName, indexType, docId).setSource(idJsonDocMap.get(docId)));
    }
    org.elasticsearch.action.bulk.BulkResponse bulkResponse = bulkRequestBuilder.get();
    return bulkResponse;
}