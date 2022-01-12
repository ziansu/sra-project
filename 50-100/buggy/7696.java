protected java.lang.Boolean execute(java.lang.Object... args) {
    try {
        client.prepareDelete(indexName, ".percolator", queryName).setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE).execute().actionGet();
        return true;
    } catch (java.lang.Exception e) {
        org.apache.unomi.persistence.elasticsearch.ElasticSearchPersistenceServiceImpl.logger.error("Cannot delete query", e);
    }
    return false;
}