public void testMultiThreadedNPlaneZMultiValueSparseFaceting() throws java.lang.Exception {
    testFacetImplementation(SparseKeys.COUNTER_IMPL.nplanez, org.apache.solr.request.sparse.SparseFacetTest.MULTI_DV_FIELD, "multi_", 2, "id:062");
}