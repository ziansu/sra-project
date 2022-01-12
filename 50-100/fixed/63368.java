@org.junit.Test
public void testEmptyTopLevelFilter() {
    client().prepareIndex("test", "type", "1").setSource("field", "value").setRefresh(true).get();
    org.elasticsearch.action.search.SearchResponse searchResponse = client().prepareSearch().setPostFilter("{}").get();
    assertHitCount(searchResponse, 1L);
}