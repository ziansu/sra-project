@org.junit.Test
public void testSearchEmptyDoc() {
    org.elasticsearch.test.hamcrest.ElasticsearchAssertions.assertAcked(prepareCreate("test").setSettings("{\"index.analysis.analyzer.default.type\":\"keyword\"}"));
    client().prepareIndex("test", "type1", "1").setSource("{}").get();
    refresh();
    org.elasticsearch.test.hamcrest.ElasticsearchAssertions.assertHitCount(client().prepareSearch().setQuery(org.elasticsearch.index.query.QueryBuilders.matchAllQuery()).get(), 1L);
}