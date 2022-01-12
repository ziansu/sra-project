public void testPutDocument() {
    assumeFalse("JDK is JDK 9", Constants.JRE_IS_MINIMUM_JAVA9);
    org.elasticsearch.client.Client client = getClient();
    client.prepareIndex(index, "doc", "1").setSource("foo", "bar").get();
    client.admin().indices().prepareRefresh(index).get();
    org.elasticsearch.action.search.SearchResponse searchResponse = client.prepareSearch(index).get();
    assertThat(searchResponse.getHits().getTotalHits(), org.hamcrest.CoreMatchers.is(1L));
}