void assertBasicSearchWorks() {
    org.elasticsearch.action.search.SearchRequestBuilder searchReq = client().prepareSearch("test").setQuery(org.elasticsearch.index.query.QueryBuilders.matchAllQuery());
    org.elasticsearch.action.search.SearchResponse searchRsp = searchReq.get();
    org.elasticsearch.test.hamcrest.ElasticsearchAssertions.assertNoFailures(searchRsp);
    long numDocs = searchRsp.getHits().getTotalHits();
    logger.info((("Found " + numDocs) + " in old index"));
    searchReq.addSort("long_sort", SortOrder.ASC);
    org.elasticsearch.test.hamcrest.ElasticsearchAssertions.assertNoFailures(searchReq.get());
}