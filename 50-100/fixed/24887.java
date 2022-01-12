@org.junit.Test
public void authorizedStatusForRestWithValidUserAndPassword() throws java.lang.Exception {
    loadConfiguration("authentication/basic/minimal");
    int statusCode = org.apache.http.client.fluent.Request.Get(((com.floragunn.searchguard.authentication.HttpBasicAuthenticationTest.httpDomain) + "/_search")).addHeader(new org.apache.http.message.BasicHeader("Authorization", ("Basic " + (encodeBasicHeader("test_user", "spock"))))).execute().returnResponse().getStatusLine().getStatusCode();
    org.hamcrest.MatcherAssert.assertThat("In case successfully authentication rest status code should be ok(200)", statusCode, org.hamcrest.Matchers.equalTo(HttpStatus.SC_OK));
}