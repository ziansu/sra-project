@org.junit.Test
public void emptyCommunitiesList() throws java.lang.Exception {
    java.lang.String result = makeRequest("/communities");
    org.junit.Assert.assertThat(result, org.junit.matchers.JUnitMatchers.containsString("\"communities_collection\": [\n\n]}"));
}