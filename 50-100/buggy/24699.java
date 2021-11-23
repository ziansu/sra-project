@org.junit.Test
public void unauthorizedStatusForRestWithNotExistUser() throws java.lang.Exception {
    loadConfiguration("authentication/basic/minimal");
    int statusCode = org.apache.http.client.fluent.Request.Get(((com.floragunn.searchguard.authentication.HttpBasicAuthenticationTest.httpDomain) + "/_search")).addHeader(new org.apache.http.message.BasicHeader("Authorization", ("Basic " + (com.floragunn.searchguard.support.Base64Helper.encodeBasicHeader("notExistsUser", "notValidPassword"))))).execute().returnResponse().getStatusLine().getStatusCode();
    org.hamcrest.MatcherAssert.assertThat(("When user name not exists or password not valid, rest api shoul return unauthorized status(401). " + "401 response indicates that authorization has been refused for those credentials"), statusCode, org.hamcrest.Matchers.equalTo(HttpStatus.SC_UNAUTHORIZED));
}