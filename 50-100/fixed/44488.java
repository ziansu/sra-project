@org.junit.Test
public void testGetWebserviceTaskPostReturnsCorrectJSON() {
    javax.ws.rs.core.Response response = base.path("scenario/145/webservice/390/post").request().get();
    org.junit.Assert.assertThat("Get webservice Task configuration returns not an valid JSON object", "{\"value\":\"{\\\"value\\\":\\\"post\\\"}\"}", net.javacrumbs.jsonunit.JsonMatchers.jsonEquals(response.readEntity(java.lang.String.class)).when(Option.IGNORING_ARRAY_ORDER));
}