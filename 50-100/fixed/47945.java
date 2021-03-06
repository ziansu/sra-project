@org.junit.Test
public void testSearchEmptyDoc() {
    assertAcked(prepareCreate("test").setSettings("{\"index.analysis.analyzer.default.type\":\"keyword\"}"));
    client().prepareIndex("test", "type1", "1").setSource("{}").get();
    refresh();
    assertHitCount(client().prepareSearch().setQuery(matchAllQuery()).get(), 1L);
}