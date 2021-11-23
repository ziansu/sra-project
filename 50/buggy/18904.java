@org.junit.Test
public void testToken() throws java.io.IOException {
    com.mesosphere.sdk.dcos.auth.TokenProvider tokenProvider = new com.mesosphere.sdk.dcos.auth.StaticTokenProvider("test-token");
    org.junit.Assert.assertEquals(tokenProvider.getToken(), "test-token");
}