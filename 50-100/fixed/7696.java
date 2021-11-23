protected java.lang.Boolean execute(java.lang.Object... args) throws java.lang.Exception {
    try {
        client.prepareDelete(indexName, ".percolator", queryName).setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE).execute().actionGet();
        return true;
    } catch (java.lang.Exception e) {
        throw new java.lang.Exception("Cannot delete query", e);
    }
}