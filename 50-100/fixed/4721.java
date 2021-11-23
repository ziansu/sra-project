@org.junit.Test
public void testError() throws java.io.IOException {
    org.searsia.web.Search search = new org.searsia.web.Search(org.searsia.web.SearchTest.index, org.searsia.web.SearchTest.engines);
    javax.ws.rs.core.Response response = search.query("wrong.json", "testquery", null, null);
    int status = response.getStatus();
    org.junit.Assert.assertEquals(503, status);
}