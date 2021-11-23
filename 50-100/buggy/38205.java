@org.junit.Test
@java.lang.SuppressWarnings(value = "unchecked")
public void recentChangesWithFewChangesHasNoContinue() throws org.wikidata.query.rdf.tool.exception.RetryableException {
    org.json.simple.JSONObject changes = repo.fetchRecentChanges(new java.util.Date(java.lang.System.currentTimeMillis()), 500);
    java.util.Map<java.lang.String, java.lang.Object> c = changes;
    assertThat(c, org.hamcrest.Matchers.not(org.hamcrest.Matchers.hasKey("continue")));
    assertThat(c, org.hamcrest.Matchers.hasKey("query"));
    assertThat(((java.util.Map<java.lang.String, java.lang.Object>) (c.get("query"))), org.hamcrest.Matchers.hasKey("recentchanges"));
}