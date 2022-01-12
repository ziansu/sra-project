public void testFacetImplementation(org.apache.solr.request.sparse.SparseKeys.COUNTER_IMPL implementation, java.lang.String field, java.lang.String resultPrefix, int threads) throws java.lang.Exception {
    testFacetImplementation(implementation, field, resultPrefix, threads, "*:*", (-1));
}