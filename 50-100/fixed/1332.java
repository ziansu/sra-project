protected java.lang.Boolean execute(java.lang.Object... args) throws java.lang.Exception {
    try {
        org.apache.unomi.persistence.elasticsearch.ElasticSearchPersistenceServiceImpl.logger.info(("Saving query : " + queryName));
        client.prepareIndex(indexName, ".percolator", queryName).setSource(query).setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE).execute().actionGet();
        return true;
    } catch (java.lang.Exception e) {
        throw new java.lang.Exception("Cannot save query", e);
    }
}