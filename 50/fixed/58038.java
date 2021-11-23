@org.junit.Test(expected = com.losd.reqbotweb.exception.ReqbotWebException.class)
public void it_handles_a_bad_request_when_getting_a_list_of_buckets() throws java.lang.Exception {
    stubFor(get(urlEqualTo("/buckets")).willReturn(aResponse().withStatus(500).withBody("Server Error")));
    client.getBuckets();
}