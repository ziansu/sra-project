@org.junit.Test
public void passQueryAsStringTest() throws java.lang.Exception {
    createIndex("test");
    client().prepareIndex("test", "type1", "1").setSource("field1", "value1_1", "field2", "value2_1").setRefresh(true).get();
    org.elasticsearch.action.search.SearchResponse searchResponse = client().prepareSearch().setQuery("{ \"term\" : { \"field1\" : \"value1_1\" }}").get();
    assertHitCount(searchResponse, 1L);
}