@org.junit.Test
public void testHostsEmptyArray() {
    replay(mockHostService);
    com.sun.jersey.api.client.WebResource rs = resource();
    java.lang.String response = rs.path("hosts").get(java.lang.String.class);
    org.junit.Assert.assertThat(response, org.hamcrest.Matchers.is("{\"hosts\":[]}"));
}