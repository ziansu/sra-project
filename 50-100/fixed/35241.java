public org.elasticsearch.action.bulk.BulkResponse bulkDelete(java.lang.String indexName, java.lang.String indexType, java.util.Map<java.lang.String, java.lang.String> idJsonDocMap) {
    org.elasticsearch.action.bulk.BulkRequestBuilder bulkRequestBuilder = client.prepareBulk();
    for (java.lang.String docId : idJsonDocMap.keySet())
        bulkRequestBuilder.add(client.prepareDelete(indexName, indexType, docId));
    
    return bulkRequestBuilder.get();
}